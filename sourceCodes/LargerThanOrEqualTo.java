package sourceCodes;

import java.util.Scanner;

public class LargerThanOrEqualTo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Give the first number: ");
    int first = Integer.valueOf(sc.nextLine());
    System.out.println("Give the second number: ");
    int second = Integer.valueOf(sc.nextLine());

    if (first == second) {
      System.out.println("The numbers are equal!");
    } else if (first > second) {
      System.out.println("Greater number is: " + first);
    } else {
      System.out.println("Greater number is: " + second);

    }
    sc.close();
  }
}
