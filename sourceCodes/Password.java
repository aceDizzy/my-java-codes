package sourceCodes;

import java.util.Scanner;

public class Password {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Password?");
    String input = sc.nextLine();

    if (input.equals("Gojo <3")) {
      System.out.println("Welcome!");

    } else {
      System.out.println("Off with you!");

    }
  }
}
