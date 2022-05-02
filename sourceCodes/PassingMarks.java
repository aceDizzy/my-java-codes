package sourceCodes;

import java.util.Scanner;
public class PassingMarks {
  public static void main(String[] args) {
    int marksObtained, passingMarks;
    passingMarks = 40;
    Scanner input = new Scanner(System.in);
    System.out.print("Input marks scored by you: ");
    marksObtained = input.nextInt();

    if (marksObtained >= passingMarks) {
      System.out.println("You passed the exam.");
    } else if (marksObtained > 100) {
      System.out.println("Invalid.");
    } else {
      System.out.println("Unfortunately, you failed to pass the exam.");
    }
    input.close();
  }
}