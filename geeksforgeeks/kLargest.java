import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main ( String [] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer > x = new ArrayList<>();
            while ( n-- > 0 ) {
                x.add( sc.nextInt() );
            }
            Collections.sort(x);
            int len = x.size();
            for ( int i = len-1; i > len-1-k; i--)
                System.out.print(x.get(i)+" ");
            System.out.println();
        }
    }
}
