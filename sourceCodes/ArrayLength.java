package sourceCodes;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {

        int length;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        length = sc.nextInt();

        int a[] = new int[8];
        System.out.print("Input " + length + " numbers:\n");

        for (int i = 0; i < length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Squared value:\n");

        for (int i = 0; i < length; i++)
        {
            a[i] = (int) Math.pow(a[i], 2);
            System.out.print(a[i] + " ");
        }
        sc.close();


    }

}