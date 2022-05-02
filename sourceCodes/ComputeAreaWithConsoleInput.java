package sourceCodes;

import java.util.Scanner; //Scanner is in the java.util package

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = in.nextDouble();

        //Compute area
        double area = radius * radius * 3.14159;

        //Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
        
       in.close();
    }

}
