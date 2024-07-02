import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
    private static final String URL = "jdbc:mariadb://localhost:3306/EMPLOYEE";
    private static final String USERNAME = ""; // username
    private static final String PASSWORD = ""; // password

    // Create New Employee
    public void createEmployee(int id, String name, String department) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement s = connection.prepareStatement("INSERT INTO employees (id, name, department) VALUES (?, ?, ?)")) {
            s.setInt(1, id);
            s.setString(2, name);
            s.setString(3, department);
            s.executeUpdate();
            System.out.println("Employee created Successfully: || id = " + id + ", name = " + name + ", department = " + department + " ||");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read All Employees
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement s = connection.createStatement();
             ResultSet rs = s.executeQuery("SELECT * FROM employees")) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                Employee employee = new Employee(id, name, department);
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    // Get Employee By Id
    public Employee getEmployeeById(int id) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement s = connection.prepareStatement("SELECT * FROM employees WHERE id = ?")) {
            s.setInt(1, id);
            try (ResultSet rs = s.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("name");
                    String department = rs.getString("department");
                    return new Employee(id, name, department);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Update Employee By Id
    public void updateEmployee(int id, String newName, String newDepartment) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement s = connection.prepareStatement("UPDATE employees SET name = ?, department = ? WHERE id = ?")) {
            s.setString(1, newName);
            s.setString(2, newDepartment);
            s.setInt(3, id);
            int res = s.executeUpdate();
            if (res > 0) {
                System.out.println("Employee updated Successfully: || id = " + id + ", name = " + newName + ", department = " + newDepartment + " ||");
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Employee By Id
    public void deleteEmployee(int id) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement s = connection.prepareStatement("DELETE FROM employees WHERE id = ?")) {
            s.setInt(1, id);
            int res = s.executeUpdate();
            if (res > 0) {
                System.out.println("Employee deleted Successfully: id=" + id );
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
