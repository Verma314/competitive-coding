import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

        public static void main (String [] args)  {
	        Scanner sc = new Scanner (System.in);
	        int t = sc.nextInt();
	        while ( t-- > 0 ) {
	            int n = sc.nextInt();
	            int  [] ar = new int[n+1];
	            int flag = 0;
	            for ( int i = 1; i<=n; i++) {
	                ar[i] = sc.nextInt();
	                if ( ar[i] == i)    {
	                    System.out.print(i+ " ");
	                    flag = 1;
	                }
	            }
	            if ( flag == 0)
	                System.out.print("Not Found");
	            
	            System.out.println();
	            
	        }
	 }
}
