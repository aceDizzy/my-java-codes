package sourceCodes;

import java.io.*;
import java.util.*;

public class StudentFees {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader ac = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("*************************************************");
        System.out.println("               Compute Student Fees"              );
        System.out.println("PREPARED BY: Anna Clarisse T. Dela Cruz / BSIT 2A");
        System.out.println("*************************************************");

        //initializing variables
        String studName, mode1, mode2, repeat;
        char paymentMode;
        int lecUnits, labUnits, totalUnits;
        int icnt = 0, ccnt = 0, cnt = 0;
        float lecFee, labFee, totalFee, uponEnrolment, midtermPayment, finalPayment, cashPayment, grandFee;

        do{

        //asks for user input
        System.out.print("Enter student name: ");
        studName = ac.readLine();
        System.out.print("Lecture Units: ");
        lecUnits = sc.nextInt();
        System.out.print("Laboratory Units: ");
        labUnits = sc.nextInt();

        System.out.println("Student name     : " + studName);
        System.out.println("Lecture Units    : " + lecUnits);
        System.out.println("Laboratory Units : " + labUnits);

        totalUnits = lecUnits + labUnits;
        System.out.println("Total Units      : " + totalUnits);

        lecFee = lecUnits * 200; //assigning 200 value per lec unit
        labFee = labUnits * 300; //assigning 300 value per lab unit
        System.out.println("Lecture Fee      : P" + lecFee);
        System.out.println("Laboratory Fee   : P" + labFee);

        totalFee = lecFee + labFee;
        System.out.println("Total Fees       : P" + totalFee);
        System.out.println("*************************************************");

        System.out.print("Payment Mode [I, C]: ");

        uponEnrolment = totalFee * 0.5f;
        midtermPayment = totalFee * 0.25f;
        finalPayment = totalFee * 0.25f;
        cashPayment = totalFee - (totalFee * 0.05f);

        paymentMode=sc.next().charAt(0);

        mode1 = "Installment";
        mode2 = "Cash Payment";

        switch(paymentMode){

            case 'I', 'i':
                System.out.println("Payment Type           : " + mode1);
                System.out.println("Upon Enrolment Payment : P" + uponEnrolment);
                System.out.println("Midterm Payment        : P" + midtermPayment);
                System.out.println("Final Payment          : P" + finalPayment);
                icnt++;
                break;
            case 'C','c':
                System.out.println("Payment Type : " + mode2);
                System.out.println("Cash Payment : P" + cashPayment);
                ccnt++;
                break;
            default:
                System.out.println("Invalid Payment Mode!");
        }
        System.out.println("*************************************************");
        cnt++;
            System.out.print("Process another student [Y/N]? ");
            repeat = sc.next();
        }
        while (repeat.equalsIgnoreCase("Y"));
        grandFee = totalFee*cnt;

        System.out.println("*************************************************");

        System.out.println("Total Count of Instalment   : " +icnt);
        System.out.println("Total Count of Cash Payment : " +ccnt);
        System.out.println("Total Students Processed    : " +cnt);
        System.out.println("Grand Total Fees            : P" +(grandFee-(ccnt*(totalFee*0.05f))));

        System.out.println("*************************************************");
       
        sc.close();
    }
}