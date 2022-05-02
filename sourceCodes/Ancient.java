package sourceCodes;

import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(sc.nextLine());

        if (year < 2015) {
            System.out.println("Ancient history!");
        } else
            System.out.println("Very advanced!");
        sc.close();
    }
    

}


