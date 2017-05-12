import java.lang.*;
import java.io.*;
import java.util.*;

/** am i tired, it took me longer than it should have.
    19 minutes/
    
    or i am just bad at indexes?!
    **/
class GFG {
    public static void main (String []args ) {
        Scanner sc = new Scanner (System.in );
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n  = sc.nextInt();
            int k = sc.nextInt()-1;
            int [] arr = new int [n];
            for ( int i = 0; i < n; i++ ) 
                arr[i] = sc.nextInt();
            
            for ( int i = 0 ; i < n; i ++ ) {
                if ( i == k)
                    System.out.print(arr[n-1-k] + " " );
                else if ( i == (n-1-k) ) 
                    System.out.print(arr[k]+ " ");
                else
                    System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
