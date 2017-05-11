import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
        public static void main (String [] args)  {
            Scanner sc = new Scanner (System.in);
            int t = sc.nextInt();
            while ( t-- > 0 ) {
                int n = sc.nextInt(); 
                int [] array = new int [n];
                int [] realarray = new int[n];
                for ( int i = 0; i < n-1 ; i++ ) 
                    array[i] = sc.nextInt();
                for( int i = 0; i < n; i ++)
                    realarray[i] = i+1;
                for ( int i = 0; i < n; i++ ) {
                    if ( array[i] != realarray[i] )  {
                        System.out.println(realarray[i]);
                        break;
                    }
                }
            }
	 }
}
