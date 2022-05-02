package employee;

import java.util.*;

public class EmployeeFilesTest {
     public static void main(String[] args) {
    
     //Create array of employee record  
     String EmployeeRecord[] = new String[20] ;
 
     //Create and initialize employee records
     EmployeeRecord[0] = new String("Ace");
     EmployeeRecord[1] = new String("Boa");
     EmployeeRecord[2] = new String("Chopper");
     EmployeeRecord[3] = new String("Deau");
     EmployeeRecord[4] = new String("Ely");
     EmployeeRecord[5] = new String("Frankie");
    
     //Implementing array method
     EmployeeFiles.showEmployeeNames();
     System.out.println(EmployeeRecord.length);
     
     }
}
