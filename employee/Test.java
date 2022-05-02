package employee;

public class Test {

    public static void main(String[] args) {

        //Creates three objects for employee record
        Employee a = new Employee();
        Employee b = new Employee();
        Employee c = new Employee();

        //Sets the name of the employees
        a.setName("Ace");
        b.setName("Boa");
        c.setName("Chopper");

        //Sets the department of the employees
        a.setDepartment("Accounting");
        b.setDepartment("Research and Development");
        c.setDepartment("Marketing");

        //Sets the salary of the employees
        a.setSalary(2500);
        b.setSalary(3000);
        c.setSalary(2000);

        //Prints employee details
        a.printDetails();
        b.printDetails();
        c.printDetails();

    }
}