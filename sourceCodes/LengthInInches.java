package sourceCodes;

import java.util.Scanner;
public class LengthInInches {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length in inches: ");
        int inch = Integer.valueOf(scanner.nextLine());
        double meter = inch*2.54/100;
        System.out.println("Equivalent in meters: " + meter);
        scanner.close();
	}
}
