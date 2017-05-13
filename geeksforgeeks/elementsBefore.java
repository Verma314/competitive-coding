import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    
    public static boolean test (ArrayList<Integer> x, int num ) {
        for ( Integer i : x) {
            if ( new Integer(num) <= i)
                return false;
        }
        return true;
    }
    
    
    
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> x = new ArrayList<>();
            int count = 0; int ent = 0;
            while ( n-- > 0) {
                ent = ( sc.nextInt());
                if ( test( x , ent) ) {
                    //System.out.print(" ent: "+ent+ " list " + x+ " ");
                    count++;
                }
                x.add(ent);
            }
            System.out.println(count);
        }
    }
}
