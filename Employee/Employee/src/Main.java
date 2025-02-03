public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Alif Rahman");
        employee.setSalary(50000);
        System.out.println(employee);

        Manager manager = new Manager();
        manager.setName("Rofiq");
        manager.setSalary(12000);
        manager.setDepartment("IT");
        System.out.println(manager);


        Executive executive = new Executive();
        executive.setName("nam nami");
        executive.setSalary(40000);
        executive.setDepartment("Finance");
        System.out.println(executive);
    }

}
