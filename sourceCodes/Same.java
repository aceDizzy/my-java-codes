package sourceCodes;

import java.util.Scanner;

public class Same {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String first = sc.nextLine();
    System.out.print("Enter the second string: ");
    String second = sc.nextLine();

    if(first.equals(second)) {
      System.out.println("Same");
    } else {
      System.out.println("Different");
    }
    sc.close();
  }
}