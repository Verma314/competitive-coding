import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0  ) {
            int n = sc.nextInt();
            String s = Integer.toString(n);
            int len = s.length();
            
            int sum = 0 ;
            for ( int i = 0 ; i < len; i++) {
                sum += Character.getNumericValue ( s.charAt(i) );
            }
        
            if ( n % sum == 0) 
                System.out.println(1);
            else
                System.out.println(0);
            
        }
    }
}
