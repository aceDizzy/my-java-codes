package sourceCodes;

//I will import util package because I will use Scanner
//I just use * because it is for all and it is shorter to type
import java.util.*;

//TshirtSales is the name of the Class it is capitalized
public class TShirtSales {
public static void main(String[] args) {

  int noOfShirts; //initialize noOfShirts int data type
  Scanner sc = new Scanner(System.in); //using scanner

  System.out.println("Enter desired size: ");//prompt for size
  char size = sc.next().charAt(0);//asks for size user input
  System.out.println("Enter the number of shirts: ");//prompt for no of shirt
  noOfShirts = sc.nextInt();//asks for quantity

  switch(size) { //use switch statement
    case 'S': //uppercase s
    case 's': //lowercase s diff input same output
  //  case s:
  //get total by multiplying the no of shirts and price depending on size
    System.out.println("Total amount of purchased: " + noOfShirts * 125.00);
    break; //breaking the case operator to proceed to next
    case 'M':
    case 'm':
  //  case m:
    System.out.println("Total amount of purchased: " + noOfShirts * 152.50);
    break;
    case 'L':
    case 'l':
  //  case l:
    System.out.println("Total amount of purchased: " + noOfShirts * 189.75);
    break;
    case 'X':
    case 'x':
//    case x:
    System.out.println("Total amount of purchased: " + noOfShirts * 220.25);
    break;
    default: //default is performed if the input didnt match any case values
    System.out.println("INVALID");
    break; //final break
      }
      System.out.println("Thank you!"); //last print 
      sc.close();
    }
  }
