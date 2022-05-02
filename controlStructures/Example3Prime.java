package controlStructures;
/* 
 * Example 3: This program is used to demonstrate 
 * either an input number is prime or not
 */
import javax.swing.*;
class Example3Prime {
public static void main(String[] args) {
	int x;
	String userInput;
	userInput=JOptionPane.showInputDialog("Enter a number");
	x = Integer.parseInt(userInput);
	//1,2 and 3 are prime numbers
	if(x == 1 || x == 2 || x == 3) {
		System.out.println(x + " is prime");
	}
	//All even numbers > 2 are not prime
	else if(x % 2 == 0) {
		System.out.println(x + " is not prime");
	}else {
		//We have to check using division remainder
		//we initially suppose that x is prime
		boolean prime = true;
		//No number has factor greater than its half
		for(int i = 3; i <=x / 2; i++) {
			if(x % i == 0) {
				//We have found a factor
				//so x is not prime
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.println(x + " is prime");
		}
		else {
			System.out.println(x + " is not prime");
		}
	}
}
}
