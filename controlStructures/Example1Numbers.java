package controlStructures;
/* 
 * Example 1: This program is used to demonstrate 
 * the uses of if-else condition.
 */
import java.io.*;
public class Example1Numbers {

	public static void main(String[] args)
	throws IOException{
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		int x;
		String userInput;
		System.out.print("Enter a number: ");
		userInput = in.readLine();
		x = Integer.parseInt(userInput);
		if(x == 0) {
			System.out.println("zero");}//x is positive
			else if(x > 0) {//x is even
				if(x % 2 == 0) {
					System.out.println("positive and even");
				}//x is odd
				else {
					System.out.println("positive and odd");
				}
			}//x is negative
			else {//x is even
				if(x % 2 == 0) {
					System.out.println("negative and even");
				}//x is odd
				else {
					System.out.println("negative and odd");
				}
			}
		
		}
	}


