import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            String l = Long.toBinaryString(sc.nextLong());
            int len = l.length();
            int num = 0;
            int pos = 0;
            for ( int i = len-1; i >= 0; i--)
                if ( l.charAt(i) == '1') {
                    num++;
                    pos = i;
                }
            if  ( num == 1 ) {
                System.out.println(len-pos);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
