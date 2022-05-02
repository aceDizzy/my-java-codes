package sourceCodes;

public class InfiniteLoop {
	  static int count = 0;
	  static void p() {
	    if(count <= 10) {
	      System.out.println("hello " + count);
	      p();
	    }
	  }
	  public static void main(String[] args) {
	    p();
	  }
	}
