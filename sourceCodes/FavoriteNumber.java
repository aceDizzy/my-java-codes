package sourceCodes;

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Guess my favorite number! ");
            int command = Integer.valueOf(sc.nextLine());

            if (command == 4) {
            	System.out.println("You got it!");
                break;
            }
        }
        sc.close();
    }

}
