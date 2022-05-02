package sourceCodes;

//Reads in two integers and then outputs their sum, difference, and product.
import java.util.Scanner;

public class SumDifferenceProduct {

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Give the first integer: ");
 int first = Integer.valueOf(sc.nextLine());
 System.out.print("Give the second integer: ");
 int second = Integer.valueOf(sc.nextLine());

 System.out.println("The sum of the two integers is " + (first + second) + ".");
 System.out.println("The difference of the two integers is " + (first - second) + ".");
 System.out.println("The product of the two integers is " + (first * second) + ".");
}
}