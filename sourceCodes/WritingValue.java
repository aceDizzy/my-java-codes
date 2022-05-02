package sourceCodes;

import java.util.Scanner;

public class WritingValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write an integer number:");
    int integerNum = Integer.valueOf(scanner.nextLine());
    System.out.println("You wrote " + integerNum);
    
    System.out.println("");
    
    System.out.println("Write a double number:");
    double doubleNum = Double.valueOf(scanner.nextLine());
    System.out.println("You wrote " + doubleNum);
    
    System.out.println("");

    System.out.println("Write a boolean:");
    boolean booleanValue = Boolean.valueOf(scanner.nextLine());
    System.out.println("You wrote: " + booleanValue);
    
    scanner.close();
  }
}
