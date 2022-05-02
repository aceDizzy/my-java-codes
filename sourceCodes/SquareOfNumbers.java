package sourceCodes;

public class SquareOfNumbers {
	public static void main(String[] args) {
		int t = 0; //declaring int t

    System.out.println("Square of numbers"); //print title
		System.out.println("num    square"); //column titles

		for(int x = 10; x >= 1; x--) { //int start from 10 and decrements until >=1
				t = x * x; //squaring
			{
				System.out.print(x + "\t" + t); //x is num, i is square, \t is tab space
			}
			System.out.println(); //separates output in columns
		}
	}
}
