import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in) ;
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            String a = sc.next();
            String b = sc.next();
            int alen = a.length(); int blen = b.length();
            List <Character> A = new ArrayList<>(); 
            List <Character> B = new ArrayList<>();
            
            for ( int i = 0; i < alen; i++) 
                A.add(new Character( a.charAt(i) ) );    
            for ( int i = 0; i < blen; i++)
                B.add(new Character( b.charAt(i) ) );   
                
            for ( Character x : A) {
                if ( !B.contains(x) ) 
                    System.out.print(x);
            }
            System.out.println();
            
        }
    }
}
