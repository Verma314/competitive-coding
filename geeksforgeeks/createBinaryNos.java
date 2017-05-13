import java.lang.*;
import java.io.*;
import java.util.*;
class GFG {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            for ( int i = 1; i <= n ; i++)
                System.out.print(Integer.toBinaryString(i)+" ");
            System.out.println();
        }
        
    }
} 
