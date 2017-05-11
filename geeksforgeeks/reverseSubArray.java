import java.io.*;
import java.lang.*;
import java.util.*;
class GFG {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while ( t -- > 0 ) {
            int n = in.nextInt();
            int [] arr = new int[n];
            for ( int i = 0 ; i < n; i++) 
                arr[i] = in.nextInt();
            int l = in.nextInt()-1;
            int r = in.nextInt()-1;
            for ( int i = 0; i < l; i++) 
                System.out.print(arr[i] + " ");
            for ( int i = r; i >= l; i--)
                System.out.print(arr[i]+ " ");
            for ( int i = r+1; i < n; i ++)
                System.out.print(arr[i]+" ");
        
            System.out.println();
        }
    }
}
