import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
        public static void main (String [] args)  {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while ( t-- > 0 )  {
	            ArrayList <Integer> plus = new ArrayList<>();
	            ArrayList <Integer> minus = new ArrayList<>();
	            int n = sc.nextInt();
	            int [] array = new int[n];
	            for ( int i = 0 ; i < n; i++ ) {
	                array[i] = sc.nextInt();
	                if ( array[i] >= 0)
	                    plus.add(array[i]);
	                else
	                    minus.add(array[i]);
	            }
	            //check lengths of the arrays
	            int plussize = plus.size();
	            int minsize = minus.size();
	            	            if ( plussize == minsize) {
	                for ( int i = 0; i < plussize; i++) {
	                    System.out.print(plus.get(i)+" "+minus.get(i) +" " );
	                }
	            }
	            else {
	                for ( int i = 0 ; i < minsize; i++ ) {
	                    System.out.print(plus.get(i)+" "+minus.get(i) +" ");
	                }
	                System.out.print(plus.get(plussize-1));
	            }
	            System.out.println();
	        }
	 }
}
