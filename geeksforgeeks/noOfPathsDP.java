import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
        public static void main (String [] args)  {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while ( t-- > 0 ) {
	            
	            int m = sc.nextInt();
	            int n = sc.nextInt();
	            int [][] arr = new int[m][n];
	            
	            for ( int i = 0; i < n; i++) 
	                arr[0][i] = 1;
	                
	            for ( int i = 0 ; i < m; i++)
	                arr[i][0] = 1;
	                
	            for ( int i = 1; i < m; i++ ) {
	                for ( int j = 1; j < n; j++) {
	                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
	                }
	            }
	            System.out.println(arr[m-1][n-1]);
	        }
	        
	 }
}
