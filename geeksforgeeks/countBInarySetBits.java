import java.lang.*;
import java.util.*;
import java.io.*;


/** I am sure it can be done in better ways, in probably O(1)
    but I am not entirely sure how to do it.
    OR how to implement generation of all permuations 
    
    I will try to focus on mastering the language  right now instead of 
    learning algorithms.
    
    That I will start in a while
    
**/

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            Integer x = new Integer(n);
            String s;
            int count = 0;
            for ( int i = 1 ; i <= n; i++ ) {
                s = Integer.toBinaryString(i);
                //count the number of 1s in s
                for ( int j = 0; j < s.length(); j++ ) {
                    if ( s.charAt(j) == '1')
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
