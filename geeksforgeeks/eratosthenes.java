import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

        public static void main (String [] args)  {
            Scanner kc = new Scanner(System.in);
	        int t = kc.nextInt();
	        while ( t -- > 0 ) {
	            long n = kc.nextLong();
	            Boolean [] list = new Boolean[(int) n+1 ];
	            Arrays.fill( list, Boolean.TRUE);
	            
	            for ( int i = 2; i < n; i++ ) {
	                if (list[i] == true ) {
	                    for ( int j = i+i ; j <=n; j = j + i ) {
	                        list[j] = false;
	                    }
	                }
	            }
	            for ( int i = 2; i <= n; i++ ) {
	                if ( list[i] == true ) 
	                    System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	 }
}
