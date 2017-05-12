import java.io.*;
import java.lang.*;
import java.util.*;
class GFG {
    /**LOVED THIS PROBLEM. took 57 minutes to solved. Scraped the whole solution 2 times. Once after misinterpreting
       the question. Second, after getting some cryptic errors.
     **/

    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in );
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int [] array = new int[2 * n ];
            int min = 99999;
            int max = 0;
            for ( int i = 0; i < 2*n ; i++ ) {
                array[i] = sc.nextInt();
                if ( array[i] > max)
                    max = array[i];
                if ( array[i] < min)
                    min = array[i];
            }
            int [] ans = new int[ max + 10];
            for ( int i = 0 ; i < 2 * n; i = i + 2 ) {
                if ( ans[ array[i]] == 0 )
                    ans[ array[i]] = 2;
                for ( int j = array[i]+1; j <= array[i+1]; j++) {
                    ans[j] = 1;
                }
            } 
            for ( int i = min ;  i <= max+1; i++ ) {
                if ( ans[i] == 2){
                    System.out.print(i+" ");
                    if ( ans[i+1] == 0 || ans[i+1] == 2 )
                        System.out.print(i+" ");
                }
                if  ( ans[i] == 1  && ans[i+1] == 2)
                    System.out.print(i+" ");
                if ( ans[i] == 1 && ans[i+1] == 0)
                    System.out.print(i+" ");
                
            }
            System.out.println();
        }
    }
} 
