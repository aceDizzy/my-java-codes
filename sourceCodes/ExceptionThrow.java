package sourceCodes;

/* In this program we are checking the student age
*  If the student age < 12 and weight < 40, then our program
*  should return that the student is not eligible for registration
*/

public class ExceptionThrow {
  static void checkEligibility(int stuAge, int stuWeight) {
    if(stuAge < 12 && stuWeight < 40) {
      throw new ArithmeticException("Student is not eligible for registration.");
    }
    else {
      System.out.println("Student entry is valid!");
  }
}

public static void main(String[] args) {
  System.out.println("Welcome to the registration process!");
  checkEligibility(11, 39);
  System.out.println("Have a nice day.");
  }
}
