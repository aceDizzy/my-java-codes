package sampleOOPActivity;

// Template class

public class Student {
   
	/* 
	 * Instance variables, regular variables, attributes
	 * <modifier> <type> <name> [= < default_value >] semicolon
	 * Declare instance variables after the class declaration
	 * Starts in lower case
	 * Declare I.V. as private so only class methods can access them directly
	 * Other objects cannot access these variables directly
	 * NOTE: Always use the appropriate data type
	 */
	
    private String  name; 
    private String  address; 
    private int     age; 
    private double  mGrade; 
    private double  eGrade;
    private double  sGrade;
    private double  average;

    /*
     *  Static variables
     *  Use the word "static"
     *  Only static methods can access static variables
     *  Calling the class instead of the object created in implementation
     *  Same format in I.V, you can set default value
     */
    
    private static int studentCount = 3;

    // <modifier> <returnType> <name> (<parameter>*) ENTER then { <statement>}
 
    /*
     *  Changes the name of the student
     *  this reference can be used to setter method, for accessing I.V
     *  Whatever you passed, that is the actual value of variable
     *  Not be confused
     */

    public void setName(String name){
        this.name = name;
    }
    // Overloading methods
    public void setName(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    // Returns the name of the student
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
    	this.address = address;
    }
    public String getAddress() {
    	return address;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public int getAge() {
    	return age;
    }
    public void setMathGrade(double mGrade) {
    	this.mGrade = mGrade;
    }
    public double getMathGrade() {
    	return mGrade;
    }
    public void setEnglishhGrade(double eGrade) {
    	this.eGrade = eGrade;
    }
    public double getEnglishGrade() {
    	return eGrade;
    }
    public void setScienceGrade(double sGrade) {
    	this.sGrade = sGrade;
    }
    public double getScienceGrade() {
    	return sGrade;
    }
    public void setAverage(double average) {
    	this.average = average;
    }
    public double getAverage(){
        double average = 0;
        average = (mGrade+eGrade+sGrade)/3;
        return average;
    }

    // Returns the number of instances of StudentRecords
    public static int getStudentCount() {
        return studentCount;
    }
    
    public void print (String temp) {
    	System.out.println("Name: " + name);
    	System.out.println("Address: " + address);
    	System.out.println("Age: " + age);
    }
    
    public void print (double mGrade, double eGrade, double sGrade) {
    	System.out.println("Name: " + name);
    	System.out.println("Math Grade: " + mGrade);
    	System.out.println("English Grade: " + eGrade);
    	System.out.println("Science Grade: " + sGrade);
    }
    public void print(double average) {
    	System.out.println("Average: " + average);
    }
    
}

