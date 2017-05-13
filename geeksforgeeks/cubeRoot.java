import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            long x = sc.nextLong();
            System.out.println( (int) Math.floor( Math.cbrt(x) ) );
            
        }
    }
}
