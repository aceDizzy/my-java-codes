package sampleOOPActivity;

public class EmployeeTest {
	public static void main(String[] args) {
	
	// Creating 3 employee objects
	Employee annaRecord = new Employee("Anna", "Information Technology", 10000);
	Employee jelisisRecord = new Employee("Jelisis", "Accountancy", 20000);
	Employee laraRecord = new Employee("Lara", "Computer Science", 30000);
	
	// Setting new name
	annaRecord.setName("Ace");
	jelisisRecord.setName("Abad");
	laraRecord.setName("Carol");
	
	// Activate print method for each employee to show their details
	annaRecord.print("Anna");
	jelisisRecord.print("Jelisis");
	laraRecord.print("Lara");
	
	// Adding space
	System.out.println("");
	
	// Using getters to print the new names we set
	System.out.println("New name for Anna: " +annaRecord.getName());
	System.out.println("New name for Jelisis: " +jelisisRecord.getName());
	System.out.println("New name for Lara: " +laraRecord.getName());
	
	}

}
