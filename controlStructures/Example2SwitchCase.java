package controlStructures;
/* 
 * Example 2: This program is used to demonstrate 
 * the uses of switch-case.
 */
import java.io.*;
public class Example2SwitchCase {

	public static void main(String[] args)
	throws IOException{
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What do you want to do?");
		System.out.println("1. Print your name");
		System.out.println("2. Print your age");
		System.out.println("3. Exit");
		
		int choice;
		
		choice = Integer.parseInt(in.readLine());
		
		switch(choice) {
	
		case 1:
			System.out.print("Enter your name: ");
			String name = in.readLine();
			System.out.println("Welcome " + name);
			break;
	
		case 2:
			System.out.print("Enter your age: ");
			String age = in.readLine();
			System.out.println("You are " + age);
			break;
	
		case 3:
			System.exit(0);
		}//End switch
		
	

	}//End main

}//End class
