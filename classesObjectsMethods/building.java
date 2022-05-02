package classesObjectsMethods;

/*
 * Exercise 2:
	Create a class building that has the public member floors, area, and 
	occupants and a method areaperperson()respectively that display the 
	area per person for building. In the main() method create two 
	instance of building called house and office and display the area 
	per person by division of area/occupants.
 */

public class building {
	
	private int floors, occupants;
	private double area;
	
	// Getters
	public int getFloors() {
		return floors;
	}
	
	public int getOccupants() {
		return occupants;
	}
	
	public double getArea() {
		return area;
	}
	
	// Setters
	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	public void setOccupants(int occupants) {
		this.occupants = occupants;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	// Method areaPerPerson()
	public void areaPerPerson(String inst) {
		System.out.println("The area per person is " + area / occupants);
		
	
		
	}
}
