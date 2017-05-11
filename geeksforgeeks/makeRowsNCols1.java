import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {    

    public static void main (String [] args)  {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while( t-- > 0 ) {
            int m = sc.nextInt(); int n = sc.nextInt();
            
            List < Integer > rows = new ArrayList<>();
            List < Integer > cols = new ArrayList<>();
            
            
            int [][] ar = new int[m][n];
            for ( int i = 0 ; i < m; i ++ ) {
                for ( int j = 0 ; j < n; j ++) {
                    ar[i][j] = sc.nextInt();
                    if ( ar[i][j] == 1) {
                        rows.add(j);
                        cols.add(i);
                    }
                }
            }
            
            for (Integer i : rows) {
                for ( int j = 0; j <m; j++) {
                    ar[j][i] = 1;
                }
            }
            
            for ( Integer i : cols) {
                for ( int j = 0; j < n; j++) {
                    ar[i][j] = 1;
                }
            }
            
            
            for (int i = 0; i < m; i++ ) 
                for ( int j = 0 ; j < n; j++)
                    System.out.print(ar[i][j]+" ");
            
            System.out.println();
            
            
            
            
        }
	}
}
