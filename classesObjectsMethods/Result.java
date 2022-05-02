package classesObjectsMethods;
/* Write a class Result that contains roll no, name and marks of three subjects. 
 * The marks are stored in an array of integers. 
 */
public class Result {
	
	private String rollNo, name;
	private double oopGrade, dsaGrade, mathGrade;
	
	
	// Getters
	public String getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public double getOopGrade() {
		return oopGrade;
	}
	
	public double getDsaGrade() {
		return dsaGrade;
	}
	
	public double getMathGrade() {
		return mathGrade;
	}
		
	// Setters
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOopGrade(double oopGrade) {
		this.oopGrade = oopGrade;
	}
	
	public void setDsaGrade(double dsaGrade) {
		this.dsaGrade = dsaGrade;
	}
	
	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}
	
	// The input() method is used to input values
	public void input() {
		System.out.println("Name: " +name);
	}
	
	// The show() method is used to display values
	public void show() {
		System.out.println("Roll No. : " +rollNo );
		System.out.println("Name: " +name);
		System.out.println("OOP Grade: " +oopGrade);
		System.out.println("DSA Grade: " +dsaGrade);
		System.out.println("Math Grade: " +mathGrade);
	}
		
	// The total() returns the total marks a student
	public void total() {
		System.out.println("Total marks: " + (oopGrade+dsaGrade+mathGrade));
	}
	
	// The avg() method returns the average marks of a student
	public void avg() {
		System.out.println("Average marks: " + ((oopGrade+dsaGrade+mathGrade)/3));
	}
	
	

}
