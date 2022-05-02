package sourceCodes;

//Reads in a student’s four exam scores, as integer, and outputs the student’s average.
import java.util.Scanner;

public class StudentAverage1 {

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Score in first exam: ");
 int first = Integer.valueOf(sc.nextLine());
 System.out.print("Score in second exam: ");
 int second = Integer.valueOf(sc.nextLine());
 System.out.print("Score in third exam: ");
 int third = Integer.valueOf(sc.nextLine());
 System.out.print("Score in fourth exam: ");
 int fourth = Integer.valueOf(sc.nextLine());

 System.out.println("The student's average is " + (first+second+third+fourth)/4);
 
 sc.close();
}
}
