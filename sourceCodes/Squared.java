package sourceCodes;

import java.util.Scanner;

public class Squared {

  public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);

    int number = Integer.valueOf(rd.nextLine());

    int square = number * number;

    System.out.println(square);
    
    rd.close();
    
  }
}
