package sourceCodes;

public class Array {
    public static void main(String[] args) {

        //Array with values
        String studentNames[] = {"Anna", "Clarisse", "Ace"};
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        //Print Anna
        System.out.println(studentNames[0]);
        
        //Print sum of two elements
        System.out.println(numbers[2] + numbers[5]);

        //Assigning array elements (w/ values)
        studentNames[0] = "Boa";
        System.out.println(studentNames[0]);

        //Array without values
        String employeeNames[] = new String[20];
        
        //Assigning array elements (w/o values)
        employeeNames[0] = "Naruto";
        employeeNames[1] = "Shikamaru";

        //Print Naruto
        System.out.println(employeeNames[0]);
    }

}