import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            float a = sc.nextFloat() * 30;
            float b = sc.nextFloat();
            if ( (int) b != 60 ) {
                a = a +   (b/2 );
                a = a % 360;
            }
            b = b * 6 ;  
            int a1 = (int) Math.floor(Math.abs(a- b) );
            int a2 = Math.abs( (int) Math.floor( 360 - b +a) );
            int a3 = Math.abs( (int) Math.floor( 360 - a +b) );
            
            int  smallest = Math.min(a1, Math.min(a2, a3));
            System.out.println(smallest);
            
            
        }
    }
}
