import java.util.*;
import java.io.*;

class GFG { 
    public static void main ( String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int goat = sc.nextInt();
            int x = 0;
            for ( int i = 0 ; i < n ; i++ ) {
                if ( goat == (sc.nextInt() ) )
                    x++;
            }
            if ( x != 0)
                System.out.println(x);
            else
                System.out.println(-1);    
        }
    }

}
