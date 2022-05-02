 package sourceCodes;

import java.util.Scanner;

public class TuitionFee {


  public static void main(String[] args) {

    // declare variables
    String lname,fname,dept;
    int dcode,units,idnum;
    double regfee,miscfee,tfee,rpu,pay;

    // assign data to variables
    dept="Engineering"; units=24;
    regfee=350.00; miscfee=1800.20;

    // input
    System.out.printf("\n");
      Scanner in = new Scanner(System.in);

    System.out.printf("Last Name of Student  : ");
    lname = in.nextLine();
    System.out.printf("First Name of Student : ");
    fname = in.nextLine();
    System.out.printf("Department Code       : ");
    dcode = in.nextInt();
    System.out.printf("ID Number             : ");
    idnum = in.nextInt();
    System.out.printf("Rate per Unit         : ");
    rpu = in.nextFloat();

    // compute
    tfee=units*rpu;
    pay=tfee+regfee+miscfee;

    // display
    System.out.printf("\n\n\n");
    System.out.printf("Student Name    : %s%s\n",fname+" ",lname);
    System.out.printf("Department Code : %d\n",dcode);
    System.out.printf("Department      : %s\n",dept);
    System.out.printf("ID Number       : %s\n",idnum);
    System.out.printf("Number of Units : %d\n",units);
    System.out.printf("Rate per Unit   : %6.2f\n\n",rpu);
    System.out.printf("Total Payable   : %6.2f\n",pay);
    
    in.close();
  }
}
