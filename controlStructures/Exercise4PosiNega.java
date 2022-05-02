package controlStructures;
/*
 * Write a program that reads 10 numbers from the user then prints out how many positive numbers 
 * and negative numbers user has entered (consider 0 a positive number).
 */
import java.io.*;
class Exercise4PosiNega {
	
	public static void main(String[] args) 
	throws IOException {
		
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput;
		int x,y,posi,nega;
		
		posi = nega = 0;
		
		System.out.println("Enter ten numbers: ");
		
		for(y=1;y<=10;y++) {
			
			userInput = in.readLine();
			x = Integer.parseInt(userInput);
			
			if(x<0)nega++;
			if(x>=0)posi++;
		}
		
		System.out.println("The positive numbers are: "+posi);
		System.out.println("The negative numbers are: "+nega);
		
	}
}


