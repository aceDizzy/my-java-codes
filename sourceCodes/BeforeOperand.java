package sourceCodes;

public class BeforeOperand {
    public static void main(String[] args) {

        int i = 10;
        int j = 3;
        int k = 0;

        k = ++j + i; //will result to k = 3+1+10 = 4+10 = 14

        System.out.println(k);
    }

}