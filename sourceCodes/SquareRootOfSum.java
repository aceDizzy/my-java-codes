package sourceCodes;

import java.util.Scanner;

public class SquareRootOfSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = Integer.valueOf(sc.nextLine());
    int second = Integer.valueOf(sc.nextLine());

    int sum = first + second;
    double sqrt = Math.sqrt(sum);

    System.out.println(sqrt);
    
    sc.close();
      
  }
}
