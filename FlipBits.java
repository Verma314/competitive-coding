import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

class FlipBits {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while ( t-- > 0) {
            String s = sc.nextLine();
            char [] array = s.toCharArray();
            
            char [] array1 = new char[s.length()];
            char [] array0 = new char[s.length()];
            
            int counter0 = 0;
            int counter1 = 0;
      
            for ( int i = 0; i < s.length(); i++ ) {
                if ( i % 2 == 0 ) {
                    array1[i] = '1';
                    array0[i] = '0';
                    
                }
                
                else{
                    array1[i] = '0';
                    array0[i] = '1';
                }
                
                if ( array[i] != array0[i] )
                    counter0++;
            
                if ( array[i] != array1[i] )
                    counter1++;
            }
            
            
            
            System.out.println( Math.min( counter0, counter1 ) );
            
        }
    }
}
