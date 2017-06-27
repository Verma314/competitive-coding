import java.lang.*;
import java.io.*;
import java.util.*;

class GoldbackPrimes {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        long n = 10000;
        
        Boolean [] list = new Boolean[(int) n+1 ];
       
	    Arrays.fill( list, Boolean.TRUE);
	    
	    for ( int i = 2; i < n ; i++ ) {
	        if (list[i] == true ) {
	           for ( int j = i+i ; j <=n; j = j + i ) {
	               list[j] = false;
	           }
	       }
	    }
	    list[0] = false;
	    list[1] = false;        
    
        while ( t-- > 0) {
            int even = sc.nextInt();
            
            for ( int i = 2; i < even; i++) {
                if ( list[i] == true && list[even-i] == true ) {
                    System.out.println(i+" "+(even-i) );
                    break;
                }
            }
        
        }
    }
}
