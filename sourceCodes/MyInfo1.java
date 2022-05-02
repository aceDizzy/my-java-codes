package sourceCodes;

import java.util.Scanner;
public class MyInfo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = sc.nextLine();
    System.out.print("Enter student number: ");
    String number = sc.nextLine();
    System.out.print("Enter school name: ");
    String school = sc.nextLine();
    System.out.print("Enter section/yr: ");
    String secyear = sc.nextLine();
    System.out.print("Enter subject: ");
    String subject = sc.nextLine();

    System.out.println("Name: " + name);
    System.out.println("Student number: " + number);
    System.out.println("School name: " + school);
    System.out.println("Section/year: " + secyear);
    System.out.println("Subject: " + subject);

    System.out.println("");

    System.out.println("THANK YOU FOR ENTERING YOUR INFORMATION");
    
    sc.close();
  }
}