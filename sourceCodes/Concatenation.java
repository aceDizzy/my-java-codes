package sourceCodes;

public class Concatenation {
	  public static void main(String[] args) {

	    //create first string
	    String first = "Java";
	    System.out.println("First string: " + first);

	    //create second
	    String second = "Programming";
	    System.out.println("Second string: " + second);

	    //join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined string: " + joinedString);
	  }
	}
	//output JavaProgramming -- magkadikit