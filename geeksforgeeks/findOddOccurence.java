import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
            int ent = 0;
            for ( int i = 0; i < n; i++ ) {
                ent = sc.nextInt();
                if ( map.get( new Integer(ent) ) == null )
                    map.put ( new Integer(ent) , 1 );
                else
                    map.put ( new Integer(ent), map.get( new Integer(ent)) + 1 );
            }
            List<Integer> LIST = new ArrayList<>( map.keySet() );
            for ( Integer i : LIST ) {
                if ( map.get(i) % 2 != 0 )
                    System.out.println(i);
            }
        }
    }
}

