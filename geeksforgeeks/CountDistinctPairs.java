import java.lang.*;
import java.io.*;
import java.util.*;

class CountDistinctPairs {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int size = sc.nextInt();
            int [] arr = new int [size];
            
            for ( int i = 0;  i < size; i++ )
                arr[i] = sc.nextInt();
                
            
            int k = sc.nextInt();
            int count = 0;

            HashMap<String, Integer> map = new HashMap<>();
            
            for ( int i = 0 ; i < size; i++ ) {
                for ( int  j = 0; j < size; j++) {
                    if ( j == i )
                        continue;
                    
                    String temp = arr[i]+""+arr[j];
                    
                    if  ( map.get(temp) == null ) {
                        if ( arr[i] - arr[j] == k) {
                            map.put (temp,1 );
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        
        }
    }
}
