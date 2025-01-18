public class Main {
   public static void main(String[] args) {
    Employee employee = new Employee();
        employee.setName("Alif R");
        employee.setSalary(45000);
        System.out.println(employee.toString3());

        Manager manager = new Manager();
        manager.setName("Rafi");
        manager.setSalary(75000);
        manager.setDepartment("IT");
        System.out.println(manager.toString3());

        Executive executive = new Executive();
        executive.setName("Zubair");
        executive.setSalary(100000);
        executive.setDepartment("Sels and marketing");
        System.out.println(executive.toString3());
   }
}
