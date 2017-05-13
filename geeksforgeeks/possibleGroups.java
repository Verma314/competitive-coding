import java.lang.*;
import java.io.*;
import java.util.*;


// i brute forced it. see if there are other solutions.

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for ( int i = 0 ; i < n; i++)
                arr[i] = sc.nextInt();
            
            
            int c = 0;
            for ( int i = 0 ; i < n-1; i++) 
                for ( int j = i+1; j < n; j++  )
                    if(  (arr[i]+ arr[j])  % 3  == 0)
                        c++;
            for ( int i = 0 ; i < n-2; i++) 
                for ( int j = i+1; j < n-1; j++  )
                    for ( int k = j+1; k < n; k++ )
                        if ( (arr[i]+arr[j]+arr[k]) %3 == 0 )
                            c++;
                            
            System.out.println(c);
            
            
        }
        
        
    }
}
