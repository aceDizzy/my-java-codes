package sourceCodes;


import java.util.Scanner;

public class SalaryPay {


  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    double regularPay;
    double payPerHour;
    int hoursAWeek;
    double pay;
    double overtimeHours;
    double overtimePay;

    System.out.print("Enter your pay per hour: ");
    payPerHour = reader.nextDouble();

    System.out.print("Enter your regular hours a week: ");
    hoursAWeek = reader.nextInt();

    System.out.print("Enter your overtime hours: ");
    overtimeHours = reader.nextDouble();

    regularPay = payPerHour * hoursAWeek;

    overtimePay = overtimeHours * 1.5 * payPerHour;

    pay = overtimePay + regularPay;

    System.out.println("Your pay this week will be P" + pay);
    
    reader.close();

  }
}
