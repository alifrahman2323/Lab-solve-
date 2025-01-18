public class Employee {
    String name;
    double salary;

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String toString3(){
        return "Employee:" + name + "Salary: "+salary; 
    }
}

class Manager extends Employee{
    public String department;

    public void setDepartment(String department){
        this.department = department;
    }
    @Override
    public String toString3(){
        return "Manager: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

class Executive extends Manager {
    @Override
    public String toString3() {
        return "Executive: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}