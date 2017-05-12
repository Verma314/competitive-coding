import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main( String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t  =  sc.nextInt();
        
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            List <Integer> ll = new ArrayList<>();
            while ( n-- > 0) 
                ll.add ( sc.nextInt());
            Collections.sort(ll);
            
            int min = 9999;
            int s = 0;
            
            for (int i = 0; i < ll.size()-1; i++) {
                s = Math.abs( ll.get(i) - ll.get(i+1)  );
                if ( s  < min )
                    min = Math.abs( ll.get(i) - ll.get(i+1) ) ;
            }
            System.out.println(min);
        }
    }
}
