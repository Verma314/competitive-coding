import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
        public static void main (String [] args)  {
	        Scanner sc = new Scanner (System.in);
	        int t = sc.nextInt();
	        while ( t-- > 0) {
	            int n = sc.nextInt();
	            ArrayList<Integer> arr = new ArrayList<>();
	            for ( int i = 0 ; i < n; i ++ ) 
	                arr.add(sc.nextInt());
	            Collections.sort(arr);
	            System.out.println(arr.get(n-1) * arr.get(n-2) );
	        }
	 }
}
