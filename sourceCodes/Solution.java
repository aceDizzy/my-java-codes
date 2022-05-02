package sourceCodes;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String ans = "";
        
        int n = in.nextInt();
        
        if (n%2 == 1) {
            ans = "Weird";
        } else if (n%2 ==0 && n>=2 && n<=5) {
            ans = "Not Weird";
        } else if (n>=6 && n<=20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);
        
        in.close();
    }
}




/*Pag odd = Oddball
        Pag 0-10 tenten
                pag 11-20 bente bente
                        pag iba - ay wow */
                                