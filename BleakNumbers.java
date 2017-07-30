import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for ( int i = 0; i < 10000; i++) {
            int value = Integer.bitCount(i) + i;
            map.put(value,1);
        
        }
        
        
        while ( t-- > 0) {
            
            int N = sc.nextInt();
            if ( map.containsKey(N) )
                System.out.println(0);
            else 
                System.out.println(1);
        }
    }
}
