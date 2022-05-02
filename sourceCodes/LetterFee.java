package sourceCodes;

import java.util.Scanner;

public class LetterFee {


  public static void main(String[] args) {

    // declare variables
    String lname,fname,dtype,ltype;
    int dcode;
    double lfee,dfee,tfee;

    // assign data to variables
    dtype="Special"; ltype="Citywide"; dfee=30.50;

    // input
    System.out.printf("\n");
      Scanner in = new Scanner(System.in);

    System.out.printf("Last Name of Sender : ");
    lname = in.nextLine();
    System.out.printf("First Name of Sender: ");
    fname = in.nextLine();
    System.out.printf("Delivery Code       : ");
    dcode = in.nextInt();
    System.out.printf("Letter Fee          : ");
    lfee = in.nextFloat();

    // compute
    tfee=lfee+dfee;

    // display
    System.out.printf("\n\n\n");
    System.out.printf("Sender Name  : %s%s\n",fname+" ",lname);
    System.out.printf("Delivery Code: %d\n",dcode);
    System.out.printf("Delivery Type: %s\n",dtype);
    System.out.printf("Letter Type  : %s\n",ltype);
    System.out.printf("Letter Fee   : %6.2f\n",lfee);
    System.out.printf("Delivery Fee : %6.2f\n\n",dfee);
    System.out.printf("Total Fee    : %6.2f\n",tfee);
    
    in.close();
  }
}