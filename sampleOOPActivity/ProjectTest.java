package sampleOOPActivity;

public class ProjectTest {
	public static void main(String[] args) {
		
		/*
		 * Create object
		 * Usual constructor in creating objects
		 * But we need constructor which adds value
		 * Pag naglagay ng value sa object na cinreate nang walang constructor, mag-eerror
		 */
		
		
		Project obj1 = new Project("oop", 1000); // initialize the object values of obj1
		Project obj2 = new Project(); // implicit constructor
		
		System.out.println(obj1.getName());
		
		obj2.setName("DSA",500);
		System.out.println(obj2.getName());
		
		obj2.setName("Anna",5000); //pag di naglagay value sa set, mag null at 0.0 
		System.out.println(obj2.getName());
		
		
	}

}
