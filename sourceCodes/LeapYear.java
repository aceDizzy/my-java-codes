package sourceCodes;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Give a year: ");
    int year = Integer.valueOf(sc.nextLine());
      // != means not equal to
    if (year % 4 == 0 && year % 100 != 0) {
      System.out.println("The year is a leap year.");

    } else if (year % 100 == 0 && year % 400 == 0) {
      System.out.println("The year is a leap year.");

    } else {
      System.out.println("The year is not a leap year.");

    }
    sc.close();
  }
}
