public class Main {
    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();
        System.out.println("\nCRUD Operation Using ArrayList\n");
        // Create employees
        employeeCRUD.createEmployee(1, "Tanav", "Sales");
        employeeCRUD.createEmployee(2, "Akash", "Finance");
        employeeCRUD.createEmployee(3, "Anuj", "HR");
        employeeCRUD.createEmployee(4, "Pankaj", "Sales");
        employeeCRUD.createEmployee(5, "Narun", "HR");


        // Read All Employees
        System.out.println("\n\n********** All Employees Details **********");
        for (Employee employee : employeeCRUD.getAllEmployees()) {
            System.out.println(employee);
        }

        System.out.println("\nEmployee with ID 4:");
        Employee employee = employeeCRUD.getEmployeeById(4);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found");
        }
        System.out.println("\n");
        // Update employee
        employeeCRUD.updateEmployee(3, "Umang", "Marketing");
        System.out.println("\n");

        // Delete employee
        employeeCRUD.deleteEmployee(3);

    }
}