import java.io.*;
import java.lang.*;
import java.util.*;

/** took me longer than it should have 38 minutes, I changed approach in the middle, 
    used ArrayLists instead of hashmaps. its an O(n2) solution
    wonder if there are better solutions to this.
    
 **/



class GFG {
    public static void main( String [] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while ( t-- > 0 ) {
            int a = in.nextInt(); int b = in.nextInt();
            List <Integer > A = new ArrayList<>();
            List <Integer > B = new ArrayList<>();
            Integer count = new Integer(0);
            for ( int i = 0 ; i < a; i++) 
                A.add( in.nextInt());
            for  ( int i = 0; i < b; i++) {
                count = new Integer( in.nextInt());    
                if ( A.contains(count) )
                    B.add( count);
            }
            Collections.sort(B);
            if ( B.size() > 0 ) 
                for (Integer i: B) 
                    System.out.print(i+" ");
            else
                System.out.print("Zero");
            System.out.println();
        }
    }
}
