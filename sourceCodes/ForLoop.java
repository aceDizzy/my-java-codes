package sourceCodes;

public class ForLoop {
    
    public static void main(String[] args) {
  
        for (int x=0; x<6; x++){
            for (int y= 0; y<x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
