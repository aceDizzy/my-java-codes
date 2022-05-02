package classesObjectsMethods;

/*
 * Exercise 2:
	Create a class building that has the public member floors, area, and 
	occupants and a method areaperperson()respectively that display the 
	area per person for building. In the main() method create two 
	instance of building called house and office and display the area 
	per person by division of area/occupants.
 */

public class building1 {
	public static void main(String[] args) {
		
		building house = new building();
		building office = new building();
		
		// house
		house.setFloors(2);
		house.setArea(48);
		house.setOccupants(5);
		
		// office
		office.setFloors(4);
		office.setArea(112);
		office.setOccupants(8);
		
		house.areaPerPerson("house");
		office.areaPerPerson("office");
		
	}

}
