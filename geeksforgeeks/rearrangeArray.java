import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> x = new ArrayList<>();
            while ( n-- > 0)
                x.add ( sc.nextInt());
                
            Collections.sort(x);
            int len = x.size();
            
            if ( len %2 != 0 ) {
                for ( int i = 0; i < len/2; i++)  {
                    System.out.print(x.get(i) +" "+ x.get(len-1-i) + " ");
                }
                System.out.println(x.get(len/2) );
            }
            else {
                for ( int i = 0; i < len/2; i++)  {
                    System.out.print(x.get(i) +" "+ x.get(len-1-i) + " ");
                }
                System.out.println();
            }
        }   
    }
}
