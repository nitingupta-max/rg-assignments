import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
    private List<Employee> employees;

    public EmployeeCRUD() {
        this.employees = new ArrayList<>();
    }

    // Create employee
    public void createEmployee(int id, String name, String department) {
        Employee employee = new Employee(id, name, department);
        employees.add(employee);
        System.out.println("Employee created Successfully: " + employee);
    }

    // Read All Employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Get Employee by Id
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    // Update Employee by Id
    public void updateEmployee(int id, String newName, String newDepartment) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employee.setName(newName);
            employee.setDepartment(newDepartment);
            System.out.println("Employee updated Successfully: " + employee);
        } else {
            System.out.println("Employee not found with ID: " + id);
        }
    }

    // Delete Employee by Id
    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee deleted Successfully: " + employee);
        } else {
            System.out.println("Employee not found with ID: " + id);
        }
    }
}