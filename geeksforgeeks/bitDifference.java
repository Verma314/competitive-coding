import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args) {
        
        Scanner t = new Scanner (System.in);
        int num = t.nextInt();
        
        while ( num -- > 0 ) {
        
            String a = Integer.toBinaryString ( new Integer(t.nextInt() ) );
            String b = Integer.toBinaryString ( new Integer(t.nextInt() ) );
            int count = 0;
            int alen = a.length(); int blen = b.length();
            int diff = 0;
            int length = alen;
            if ( alen > blen) {
                diff = alen - blen;
                //add diff 0s to b
                while ( diff-- > 0)
                    b = "0"+b;
                length = alen;
            }
        
            if ( blen > alen ) {
                diff = blen - alen;
                while (diff -- > 0)
                    a = "0" + a;
                length = blen;
            }
 
            for ( int i = 0 ; i < length; i++ ) {
                if ( a.charAt(i) != b.charAt(i) )
                    count++;
            }
 
           System.out.println(count);
            
            
        }
        
        
        
    }
}
