package sourceCodes;

import java.util.Scanner;
public class NetPay {
  public static void main(String[] args) {
    String name;
    double grosspay, netpay, WT, SSS, MD, PB = 100;
    Scanner sc = new Scanner(System.in);
    System.out.print("Employee Name: ");
    name = sc.nextLine();
    System.out.print("Gross Pay: ");
    grosspay = sc.nextDouble();
    WT = grosspay * 0.15;
    SSS = grosspay * 0.0363;
    MD = grosspay * 0.0125;

    netpay = grosspay-WT-SSS-MD-PB;
    System.out.println("_____________________________________________\n");
    System.out.println("Good day " +name+ "!");
    System.out.println("_____________________________________________\n");
    System.out.println("Deductions                           Amount\n");
    System.out.println("Witholding Tax                       " + WT);
    System.out.println("SSS Contribution                     " + SSS);
    System.out.println("Medicare                             " + MD);
    System.out.println("Pag-ibig Contribution                " + PB);
    System.out.println("_____________________________________________\n");
    System.out.println("Net Pay: " + netpay);
    
    sc.close();
  }
}
