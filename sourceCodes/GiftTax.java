package sourceCodes;

import java.util.Scanner;

public class GiftTax {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Value of the gift?");
    double input = Double.valueOf(sc.nextLine());

    double tax = 0;

    if (input >= 5_000 && input < 25_000) {
      tax = 100 + ((input - 5_000) * 0.08);

    } else if (input >= 25_000 && input < 55_000) {
      tax = 1_700 + ((input - 25_000) * 0.10);

    } else if (input >= 55_000 && input < 200_000) {
      tax = 4_700 + ((input - 55_000) * 0.12);

    } else if (input >= 200_000 && input < 1_000_000) {
      tax = 22_100 + ((input - 200_000) * 0.15);

    } else if (input >= 1_000_000) {
      tax = 142_100 + ((input - 1_000_000) * 0.17);
    }
      // 1_100_000  159_100.0

    if (tax == 0) {
      System.out.println("No tax!");

    } else {
      System.out.println("Tax: " + tax);

    }
    sc.close();
  }
}
