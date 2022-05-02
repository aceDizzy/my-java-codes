package sourceCodes;

import java.util.Scanner;

public class SecondsInADay {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("How many days would you like to convert to seconds?");
    int day = Integer.valueOf(sc.nextLine());
    System.out.println(day * 86400);
    
    sc.close();
  }
}