package sourceCodes;

import java.util.Scanner;

public class AdditionFormula {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give the first number: ");
			int a = Integer.valueOf(sc.nextLine());
			System.out.print("Give the second number: ");
			int b = Integer.valueOf(sc.nextLine());

			System.out.println(a + " + " + b + " = " + (a+b));
		} catch (NumberFormatException e) {
			System.out.println("Try again!");
			e.printStackTrace();
		}
    }

}

