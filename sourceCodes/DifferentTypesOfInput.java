package sourceCodes;

import java.util.Scanner;

public class DifferentTypesOfInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Give a string:");
    String text = sc.nextLine();
    System.out.println("Give an integer:");
    int value = Integer.valueOf(sc.nextLine());
    System.out.println("Give a double:");
    double floatingPoint = Double.valueOf(sc.nextLine());
    System.out.println("Give a boolean:");
    boolean trueOrFalse = Boolean.valueOf(sc.nextLine());

    System.out.println("You gave the string " + text);
    System.out.println("You gave the integer " + value);
    System.out.println("You gave the double " + floatingPoint);
    System.out.println("You gave the boolean " + trueOrFalse);
    
    sc.close();
  }
}

