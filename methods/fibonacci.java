package methods;

import java.util.*;
class fibonacci {
	public static void main(String[] args) {
	int Fl;
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter length to Generate Fibonacci numbers: ");
	Fl = sc.nextInt();
	int[] num = new int[Fl];
	num[0] = 0;
	num[1] = 1;
	for (int i = 2; i < Fl; i++) {
	   num[i] = num[i - 1] + num[i - 2];
	}
	System.out.println("\n\nFibonacci Series: ");
	for (int i = 0; i < Fl; i++) {
	   System.out.print(num[i] + "\t");
	}
	sc.close();
	}
	}
