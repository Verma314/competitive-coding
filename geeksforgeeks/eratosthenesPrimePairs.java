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
	            
	            List <Integer> ansl = new ArrayList<>();
	            for ( int i = 2; i <= n/2; i++ ) {
	                if ( list[i] == true ) 
	                    ansl.add(i);
	            }
	            
	            for ( int i = 0; i < ansl.size(); i++ ) {
	                for ( int j = 0; j < ansl.size(); j++) {
	                    if ( ansl.get(i) * ansl.get(j)  <= n)
	                        System.out.print(ansl.get(i)+" "+ansl.get(j)+" " );
	                }
	            }
	            
	            System.out.println();
	        }
	 }
}
