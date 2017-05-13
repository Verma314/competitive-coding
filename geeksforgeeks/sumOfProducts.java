import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            int [] ar = new int[n];
            for ( int i = 0 ; i < n ; i ++)
                ar[i] = sc.nextInt();//
            int sum = 0;
            int and = 0;
            for ( int i = 0 ; i < n - 1; i ++ ) {
                for ( int j = i+1; j < n; j++) {
                    and = (int) (ar[i] & ar[j]);
                    sum = sum + and;
                }
            }
            System.out.println(sum);
        }
    }
}
