import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
        public static void main (String [] args)  {
	    Scanner k = new Scanner(System.in);
	    int t = k.nextInt();
	    while ( t-- > 0 ) {
	        int n = k.nextInt();
	        int r = k.nextInt();
	        int [] arr = new int[n];
	        for ( int i = 0; i < n; i ++ ) {
	            arr[i] = k.nextInt();
	        }
	        for ( int j = r; j < n ; j ++ ) {
	            System.out.print(arr[j]+ " ");
	        }
	        for ( int j2 = 0; j2 < r; j2++) {
	            System.out.print(arr[j2]+" ");
	        }
            System.out.println();
	    } 
	 }
}
