package sourceCodes;

public class EvenOdd {
	  public static void main(String[] args) {

	    //create an array of 10 numbers
	    int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

	    for(int i = 0; i < numbers.length; i++) {

	      //use modulus operator to check if the number is even or odd
	      //if we divide any number by 2 and remainder is 0, the number is even, otherwise odd
	      if (numbers[i]%2==0)
	        System.out.println(numbers[i] + " is an even number.");
	      else
	        System.out.println(numbers[i] + " is an odd number.");
	    }
	  }
	}