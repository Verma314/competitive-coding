import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static int takeLcm ( int a, int b ) {
        int minMultiple = a >= b ?  a : b ;  
        while ( true ) {
            if ( (minMultiple % a == 0)  && ( minMultiple % b  == 0) ) 
                return ( minMultiple);
            else
                minMultiple++;
            
        }
        
    }
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            int lcm = 1;
            
            for ( int i = 0; i < n ; i++) 
                arr[i] = sc.nextInt();
            
            
            for ( int i = 0; i < n; i++) {
                lcm = takeLcm(lcm, arr[i]);
            }
            
            System.out.println(lcm);
        }
    }
}
