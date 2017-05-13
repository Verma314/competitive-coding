import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            String s = Integer.toBinaryString ( sc.nextInt() ) ;
            int c = 0;
            for ( int i = 0 ; i < s.length(); i++) {
                if ( s.charAt(i) == '1' ) 
                    c++;
            }
            System.out.println(c);
        }
    }
}
