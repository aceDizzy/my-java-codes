package sourceCodes;

public class AfterOperand {
    public static void main(String[] args) {

        int i = 10;
        int j = 3;
        int k = 0;

        k = j++ + i; //will result to k = 3+10 = 13

        System.out.println(k);
    }

}
