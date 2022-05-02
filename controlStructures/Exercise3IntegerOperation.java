package controlStructures;

import java.io.*;
public class Exercise3IntegerOperation {
	
	public static void main(String[] args)
	throws IOException {
	
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		int x,y;
		String userInput;
		
		System.out.println("Enter first number: ");
		userInput = in.readLine();
		x = Integer.parseInt(userInput);
		
		System.out.println("Enter second number: ");
		userInput = in.readLine();
		y = Integer.parseInt(userInput);
		
		System.out.println("1. Addition (+)");
		System.out.println("2. Substraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		
		int operation;
		
		System.out.println("Enter operation number:");
		operation = Integer.parseInt(in.readLine());
		
		switch(operation) {
		
		case 1:
			System.out.println("The result is " + (x+y));
			break;
		case 2:
			System.out.println("The result is " + (x-y));
			break;
		case 3:
			System.out.println("The result is " + (x*y));
			break;
		case 4:
			System.out.println("The result is " + (x/y));
			break;
			default:
				System.out.println("Invalid!");
		}
		
	}
	

}
