package sourceCodes;

import java.io.*;
import java.util.*;

public class RepeatTShirtSales{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //title
        System.out.println("*************************************************");
        System.out.println("                    Shirt Sales                  ");
        System.out.println("PREPARED BY: Anna Clarisse T. Dela Cruz / BSIT 2A");
        System.out.println("*************************************************");

        //initializing variables
        String name, repeat;
        char shirtSize;
        int shirtQuantity, scnt = 0, mcnt = 0, lcnt = 0, xcnt = 0, tcnt = 0;
        double smallPrice=0, mediumPrice=0, largePrice=0, extraPrice=0, totalPrice=0, grandPrice=0;

        //assigning value to price
        smallPrice = 125.00;
        mediumPrice = 152.50;
        largePrice = 189.75;
        extraPrice = 220.25;

        do {
        //asks for user input
        System.out.print("Enter your name: ");
        name = br.readLine();
        System.out.print("Enter desired size [S/s, M/m, L/l/ X/x]: ");
        shirtSize=sc.next().charAt(0);
        System.out.print("Enter quantity: ");
        shirtQuantity = sc.nextInt();

        //prints the input
        System.out.println("Hello " +name+"!");
        System.out.println("You ordered " +shirtQuantity + " " + shirtSize + " size "+ "" + "t-shirts.");

        //switch block
        switch(shirtSize){
            case 'S', 's':
            System.out.println("Total amount of purchased: P" + smallPrice * shirtQuantity);
            scnt++;
            break;
            case 'M', 'm':
            System.out.println("Total amount of purchased: P" + mediumPrice * shirtQuantity);
            mcnt++;
            break;
            case 'L', 'l':
            System.out.println("Total amount of purchased: P" + largePrice * shirtQuantity);
            lcnt++;
            break;
            case 'X', 'x':
            System.out.println("Total amount of purchased: P" + extraPrice * shirtQuantity);
            xcnt++;
            break;
            default:
            System.out.println("Invalid Shirt Size!");
        }
        tcnt++;
        System.out.print("Process another order [Y/N]?");
        repeat = sc.next();
        }
        while(repeat.equalsIgnoreCase("Y"));

        System.out.println("Total Order of Small Size       : " +scnt);
        System.out.println("Total Order of Medium Size      : " +mcnt);
        System.out.println("Total Order of Large Size       : " +lcnt);
        System.out.println("Total Order of Extra Large Size : " +xcnt);
        System.out.println("Total Orders Processed          : " +tcnt);
        System.out.println("Grand Total Price               : P" +(grandPrice-tcnt*(totalPrice)));

        sc.close();
    }
}