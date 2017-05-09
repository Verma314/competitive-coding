import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    int t = 0;
	    Scanner sc = new Scanner(System.in);
	    t = sc.nextInt();
	    while ( t-- > 0 ) {
	        String s = sc.next();
            int number = 0;	       
	        int lcount = 0; int rcount = 0;
	        for ( int i = s.length()-1 ; i>= 0; i -- ) {
	            if ( s.charAt(i) == ')')
	                lcount++;
	            else if ( s.charAt(i) == '(' )
	                rcount++;
	               
	           if (  lcount == rcount) {
	                number = i - 1;
	           }
	        }
	    if ( number != 0 ) 
    	    System.out.println(number);
	    else
	        System.out.println(s.length() );
	    } 
	    
	 
	 }
}
