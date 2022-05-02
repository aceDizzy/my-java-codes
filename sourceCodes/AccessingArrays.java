package sourceCodes;
import java.util.Scanner;

public class AccessingArrays {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			//Array without values
			String employeeNames[] = new String[20];
			System.out.print("Enter employee name: ");
			employeeNames[0] = sc.nextLine();
			
			System.out.print("Enter employee name: ");
			employeeNames[1] = sc.nextLine();

			System.out.println(employeeNames[0]);
		}
    }

}
