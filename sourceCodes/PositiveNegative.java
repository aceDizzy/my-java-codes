package sourceCodes;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = in.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        in.close();
    }

}
