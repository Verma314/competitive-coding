import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
         public static void main (String [] args)  {
             Scanner ac = new Scanner(System.in);
             int k = ac.nextInt();
             while ( k -- > 0 ) {
                 String binu = ac.next();
                 int len = binu.length();
                 long answer = 0;
                 for ( int i = 0; i < len; i++ ) {
                     if ( binu.charAt(i) == '1' ) {
                         answer += Math.pow(2, len-i-1);
                     }
                 }
                 System.out.println(answer);
             }
	 
	 }
}
