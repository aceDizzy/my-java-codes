package sampleOOPActivity;
/*
 * Example #1
 
• Write a class Project which contains two members. The first member consists of project name. 
The second member is a cost of double type. ​
 
• Add a setter method that takes in a string argument to change the project’s name.​
 
• Implement a constructor which initializes the information of Project object.
 
• For each employee object, activate the setter method to change the project’s name
 */

//Template class
public class Project {
	
	private String name;
	private double cost;
	
	/*
	 *   -- setName --
	 *  this.name referring to instance variable name (private String name)
	 *  parameter name 'name', parameter data type 'String'
	 *  name; is pertaining to String name w/c is parameter you are passing
	 *  String name = string argument
	 */
	
	// Add constructor -- naglalagay ng data dun sa attributes 
	// obj2 constructor -- implicit constructor walang laman (nakadefault na)
	
	//naoverwite nung constructor na may parameter kaya need maglagay default wc is implicit, need ibalik
	public Project(){
		
	}

	// obj1 constructor 
	public Project(String name, double cost){
		this.name = name;
		this.cost = cost;
		
	}
	
	// setter method
	public void setName (String name) {
		this.name = name;
	}
	
	// overloading
	public void setName (String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	// getter method
	public String getName() {
		return "Project Name: " + name + "\n"+ "Cost: " + cost;
	}

}
