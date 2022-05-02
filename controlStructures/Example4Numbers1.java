package controlStructures;
/* 
 * Example 4: Following program that  keeps reading numbers (integers)
 * from user until input is 0, then prints average, sum, maximum and minimum.
 */
import java.io.*;
class Example4Numbers1 {
	public static void main(String[] args) throws IOException {
		int min=0, max=0, x, sum=0, count=0;
		boolean firstNumber = true;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("Enter a number: ");
			x = Integer.parseInt(in.readLine());
			if(x == 0) {
				break;
			}
			if(firstNumber) {
				min = max = x;
				firstNumber = false;
			}
			sum += x;
			if(x>max) {
				max = x;
			}
			if(x<min) {
				min = x;
			}
			count++;
		}
		System.out.println("Sum = " +sum);
		System.out.println("Average = " +sum/count);
		System.out.println("Minimum = " +min);
		System.out.println("Maximum = " +max);
	}//End main
}//End class
// 1, 2, 3, 0



