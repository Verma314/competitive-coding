import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sum = 0 ; 
            float c = 0;
            for ( int i = 0; i < n; i ++) {
                c = sc.nextInt();
                sum = sum + (int ) Math.ceil (c/k);
            }
            System.out.println(sum);
        }
    }
}
