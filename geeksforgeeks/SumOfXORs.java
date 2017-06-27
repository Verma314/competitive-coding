import java.lang.*;
import java.io.*;
import java.util.*;

class SumOfXORs {
    
    public static int countBits ( int a , int b ) {
        
        int ans = a ^ b;
        String s = Integer.toBinaryString(ans);
        int count = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            if ( s.charAt(i) == '1')
                count++;
        }    
        return count;
        
    }
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            int [] a = new int[n];
            
            for ( int i = 0; i < n; i++ ) 
                a[i] = sc.nextInt();
                
            int total = 0; int count = 0;
            for ( int i = 0; i < n; i++) {
                for ( int j = i+1; j < n; j++) {
                    count = countBits(a[i], a[j]);            
                    total += count;
                    total = total % 1000000007; //109+7.
                }
            }
            
            System.out.println(total*2);
        }
    }
}
