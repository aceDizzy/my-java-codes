package controlStructures;

public class Exercise1IfStatement {
	public static void main(String[] args) {
		
		int x = 5;
		
		if (x >= 0 && x < 9) {
			System.out.println("0 to 9");
			
			} else if (x >= 10 && x < 19) {
				System.out.println("10 to 19");
				
			} else if (x >= 20 && x < 29) {
				System.out.println("20 to 29");
				
			} else {
				System.out.println("None of the categories");
		}
	}

}
