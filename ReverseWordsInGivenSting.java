import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            String s = sc.next();
            String array[] = s.split("\\.");

            for ( int i = array.length-1; i >= 0 ; i--) {
                if ( i != 0 ) 
                    System.out.print(array[i]+".");
                else
                    System.out.println(array[i]);
            }
        }
    }
}
