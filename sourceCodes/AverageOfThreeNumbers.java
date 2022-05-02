package sourceCodes;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(sc.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(sc.nextLine());

        System.out.println("The average is " + 1.0 * (first + second + third) / 3);
       
        sc.close();
    }

}