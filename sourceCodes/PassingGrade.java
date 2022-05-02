package sourceCodes;

import java.util.Scanner;

public class PassingGrade {
  public static void main(String[] args) {

    int gradeObtained, passingGrade;
    passingGrade = 75;
    Scanner sc = new Scanner(System.in);

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Subject: ");
    String subject = sc.nextLine();

    System.out.print("Grade: ");
    gradeObtained = sc.nextInt();

    System.out.println("Student Name: " + name);
    System.out.println("Subject: " + subject);
    System.out.println("Grade: " + gradeObtained);

    if (gradeObtained >= passingGrade) {
      System.out.println("YOU HAVE A PASSING GRADE.");
    } else if (gradeObtained > 100) {
      System.out.println("INVALID.");
    } else {
      System.out.println("YOU HAVE A FAILING GRADE.");
    }
    sc.close();
  }
}
