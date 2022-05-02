package sourceCodes;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Section/Year: ");
        String secYear = sc.nextLine();

        System.out.print("Subject: ");
        String subOne = sc.nextLine();

        System.out.print("Grade: ");
        int gradeOne = Integer.valueOf(sc.nextLine());

        System.out.print("Subject: ");
        String subTwo = sc.nextLine();

        System.out.print("Grade: ");
        int gradeTwo = Integer.valueOf(sc.nextLine());

        System.out.println("");
        
        //prints user details
        System.out.println("Name: "+name);
        System.out.println("Section/Year: "+secYear);
        System.out.println("Subject: "+subOne);
        System.out.println("Grade: "+gradeOne);
        System.out.println("Subject: "+subTwo);
        System.out.println("Grade: "+gradeTwo);
        
        System.out.println("");
        
        //operations
        double result = (gradeOne + gradeTwo) / (double) 2;
        System.out.print("Total Grade: " + result);
        
        sc.close();


    }

}
