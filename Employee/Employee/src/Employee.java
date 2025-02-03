class Employee {
    private String name;
    private double salary;

   
    public Employee() {
        this.name = "";
        this.salary = 0.0;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

  
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee Name: " + name + ", Salary: " + salary;
    }
}


class Manager extends Employee {
    private String department;


    public Manager() {
        this.department = "";
    }

 
    public void setDepartment(String department) {
        this.department = department;
    }

   
    public String getDepartment() {
        return department;
    }

   
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}


class Executive extends Manager {

    
    @Override
    public String toString() {
        return "Executive Details -> " + super.toString();
    }
}