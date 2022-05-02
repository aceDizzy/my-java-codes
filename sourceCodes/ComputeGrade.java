package sourceCodes;

import java.util.Scanner;

public class ComputeGrade
{

 public static void main(String[] args)

 {
   Scanner getinfo = new Scanner(System.in);

   String name;
   float quizone;
   float quiztwo;
   float quizthree;
   float exam;
   float recitation;
   float project;
   float finalrating;
   float averagequiz;
   float totalquizes;

   System.out.print("Enter Student Name:  ");
   name =getinfo.nextLine();

   System.out.print("Enter Average Quiz:  ");
   quizone=getinfo.nextFloat();

   System.out.print("Enter Average Quiz:  ");
   quiztwo=getinfo.nextFloat();

   System.out.print("Enter Average Quiz:  ");
   quizthree=getinfo.nextFloat();

   System.out.print("Enter Major Exam:  ");
   exam=getinfo.nextFloat();

   System.out.print("Enter Recitation Grade:  ");
   recitation=getinfo.nextFloat();

   System.out.print("Enter Project Grade:  ");
   project=getinfo.nextFloat();

  totalquizes = quizone+quiztwo+quizthree;
  averagequiz = totalquizes*0.3f;
  finalrating = averagequiz*0.3f + exam*0.3f + recitation*0.1f + project*0.3f;

System.out.println("\nPrepared by: Mariano, Ian Joshua A.");
System.out.println("\nStudent Name: " + name);
System.out.println(" Quiz 1: " + quizone);
System.out.println(" Quiz 2: " + quiztwo);
System.out.println(" Quiz 3 : " + quizthree);
System.out.print("\n\nAverage quiz: ");
System.out.printf("%.2f", averagequiz);
System.out.println("\nMajor Exam: " + exam);
System.out.println("Recitation Grade: " + recitation);
System.out.println("Project Grade: " + project);
System.out.println("\n\nFinal Rating:" + finalrating);

getinfo.close();

 }
}
