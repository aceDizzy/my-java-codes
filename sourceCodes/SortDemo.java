package sourceCodes;

public class SortDemo {
	  public static void main(String[] args) {
	    //declaring
	    int[] arrayOfInts = {37,4,5,67,1,2,67,1092,43,21,65,4,8,5,4,32};
	    //for loop
	    for (int i = arrayOfInts.length; --i >= 0;) {
	      for(int j = 0; j < 1; j++) {
	        if (arrayOfInts[j] > arrayOfInts[j+1]) {
	          int temp = arrayOfInts[j];
	          arrayOfInts[j] = arrayOfInts[j+1];
	          arrayOfInts[j+1] = temp;
	        }
	      }
	    }
	    //another for loop
	    for (int i = 0; i < arrayOfInts.length; i++) {
	      System.out.println(arrayOfInts[i] + " ");
	    }
	    System.out.println();
	  }
	}
	//yung 4 at 37 lang nagbago sa arranging...
