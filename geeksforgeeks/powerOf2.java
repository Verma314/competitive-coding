import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-- > 0 ) {
	     long n = sc.nextLong();
	     String s = Long.toBinaryString(n);
	     int len = s.length();
	     int number1 = 0;
	     for ( int i = 0; i < len; i++) {
	         if ( s.charAt(i) == '1' ) {
	            number1++;
	         }
	     }
	     if (number1 == 1)
	        System.out.println("YES");
	     else
	        System.out.println("NO");
	  }
	 }
}
