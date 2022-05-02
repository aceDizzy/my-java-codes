package controlStructures;

import java.io.*;
public class Exercise2IntegerSum {
	
	public static void main(String[] args)
	throws IOException {
	
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
	
		int x, y;
		String userInput;
		
		System.out.println("Enter the first number: ");
		userInput = in.readLine();
		x = Integer.parseInt(userInput);
		
		System.out.println("Enter the second number: ");
		userInput = in.readLine();
		y = Integer.parseInt(userInput);
		
		System.out.println("The sum is " + (x+y));
		
		
	}

}
