import java.io.*;
import java.lang.*;
import java.util.*;


/ ** pretty happy with myself,
     total time taken 24.00 minutes
  **/
  
class GFG {
    
    public static long permut (long d) {
        if ( d == 1)
            return 0;
            
        if ( d == 2 ) {
            return 9;
        }
        else {
            long total =  (long) (9  * Math.pow ( 10, d-1 ) );
            long zeronums = (long)Math.pow ( 9, d);
            long answer = (long) total - zeronums;
            return ( answer + permut(d-1) );
        
        }
        
    }
    
    public static void main(String [] args) {
        Scanner sc = new Scanner( System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long d = sc.nextLong();
            System.out.println( permut(d) );
        }
    }
} 
