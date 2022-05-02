package sourceCodes;

	import java.util.*;
	public class StudentAverage {

	public static void main(String[] args) {

	    Scanner sc= new Scanner(System.in);

	      int num1;
	        System.out.print("Insert First Number: ");
	        num1 = sc.nextInt();
	      int num2;
	        System.out.print("Insert Second Number: ");
	        num2 = sc.nextInt();

	      int totalSum= num1+num2;
	      int totalDiff= num1-num2;
	      int totalProduct= num1*num2;

	  int score1,score2,score3,score4;
	  System.out.print("Insert Score 1: ");
	  score1= sc.nextInt();

	  System.out.print("Insert Score 2: ");
	  score2= sc.nextInt();

	  System.out.print("Insert Score 3: ");
	  score3= sc.nextInt();

	  System.out.print("Insert Score 4: ");
	  score4= sc.nextInt();

	double totalAve=((score1+score2+score3+score4)/4.00d);

	  String sFName,sMName,sLName,sID,sCourse;
	  System.out.print("Input Name: ");
	  sFName= sc.next();

	  System.out.print("Input M.I.: ");
	  sMName= sc.next();

	  System.out.print("Input Last Name: ");
	  sLName= sc.next();

	  String fullName= (sFName+ " " + sMName+ " "+sLName);

	  System.out.print("Input ID Number: ");
	  sID= sc.next();

	  System.out.print("Input Course: ");
	  sCourse= sc.next();

	System.out.println("Your Sum is: "+ totalSum);
	System.out.println("Your Difference is: "+ totalDiff);
	System.out.println("Your Product is: "+ totalProduct);

	  System.out.println("Total Average: "+totalAve);

	  System.out.println("Student Name: " +fullName);
	  System.out.println("Student ID Number: "+ sID);
	  System.out.println("Student Course: "+ sCourse);

	  sc.close();

	    }
	}
