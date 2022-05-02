package employee;

public class Employee {

    //Attributes or instance variables we have declared (starts w/ lowercase)
    //Private are variables only accessible within the class
    private String name;
    private String department;
    private int salary;

    //Returns the name of the student
    public String getName() {
        return name;
    }

    //Changes the name of the employe
    public void setName(String temp){
        name = temp;
    }

    //Returns the department
    public String getDepartment() {
        return department;
    }

    //Mutator method to write values of department
    public void setDepartment(String department){
        this.department = department;
    }

    //Returns the department
    public Integer getSalary() {
        return this.salary;
    }

    //Mutator method to write values of salary
    public void setSalary(int salary){
        this.salary = salary;
    }

    //Prints employee details
    public void printDetails( ) {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Department Name " + this.department);
        System.out.println("Employee salary: " + this.salary);

    }
}
