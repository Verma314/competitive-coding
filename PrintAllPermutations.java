import java.util.*;
import java.lang.*;
import java.io.*;

class PrintAllPermutations {
    
        public static void printPermut(String s, char array[] , int start, int end) {
            if ( start == end ) {
                System.out.print(array);
                System.out.print(" ");
                return;
            }
            
            String s0 = s;
            
            for ( int i = 0 ; i < s.length(); i++ ) {
                s0 = s;
                char x = s0.charAt(i);
                array[start] = x;
                StringBuilder temp = new StringBuilder(s0);
                temp.deleteCharAt( i );
                s0 = temp.toString();
                printPermut ( s0, array, start+1, end );
            }
        }


        public static void main (String [] args)  {
	        Scanner sc = new Scanner (System.in);
	        int t = sc.nextInt();
	        while ( t-- > 0 ) {
	            String s1 = sc.next();
	                   
                char[] chars = s1.toCharArray();
                Arrays.sort(chars);
                String s = new String(chars);
	            
	            char [] array = new char[s.length()];
	            printPermut(s, array, 0, s.length() );
                System.out.println();
	 	    }
	 }
}
