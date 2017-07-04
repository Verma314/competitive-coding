import java.lang.*;
import java.io.*;
import java.util.*;

class GenerateDigitsInIncreasingOrder {
    
    static void printRecur(String ans, int start, int end) {
        
        if ( start == end ) {
            System.out.print(ans+" ");
            return;
        }
        
    
        if  ( start == 0 ){
            for ( int i = 1; i <= 9 ; i++ ) 
                printRecur ( ans+Integer.toString(i), 1, end);
        }
        
        else {
            for ( int i = Character.getNumericValue(ans.charAt(start-1)); i <= 9 ; i++ ) 
                if ( Character.getNumericValue(ans.charAt(start-1) )  < i)
                    printRecur ( ans+Integer.toString(i), start+1, end );
        }
        
    }





    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n  = sc.nextInt();
            String ans = "";
            printRecur(ans,0,n);
            System.out.println();
            
        }
    }
}
