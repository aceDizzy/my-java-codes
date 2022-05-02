package classesObjectsMethods;

import java.io.*;
class ReadingSimplifier {
	public static void main(String[] args) {
		
		String name = readString("Enter your name: ");
		int age = readInt("Enter your age: ");
		
		System.out.println("Welcome " +name);
		System.out.println("Your birth year is " +(2021-age));
	}
	static String readString(String message) {
		System.out.print(message);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = in.readLine();
			return input;
		}
		catch(Exception e) {
	}
		return "";
	}
	
	static int readInt(String message) {
		String input = readString(message);
		return Integer.parseInt(input);
	}
}
