import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            List<Integer> INPUT = new ArrayList<>();
            List <Integer> EVEN = new LinkedList<>();
            List <Integer> ODD = new LinkedList<>();
            int ele; 
            while ( n-- > 0) {
                ele = sc.nextInt();
                if ( ele % 2 == 0 ) 
                    EVEN.add(ele);
                else
                    ODD.add(ele);
            }
           
            EVEN.addAll(ODD);
            for ( Integer i : EVEN )
                System.out.print(i+" ");
                

            System.out.println();
        }
    }
}
