package sourceCodes;

import java.util.Scanner;
public class TemperatureInCelsius {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Temperature in Celsius: ");
	        
	        int Ctemp = Integer.valueOf(scanner.nextLine());
	        double Cfahr = Ctemp*9.0/5+32; 
	        
	        /*Kailangan may .0 'yung 9 para maging double divided by an integer. 
	        Pag hindi siya double, integer lang ang lalabas tapos .0*/
	        System.out.println("Temperature in Fahrenheit: " + Cfahr);
	        scanner.close();
	    }
	}
	   