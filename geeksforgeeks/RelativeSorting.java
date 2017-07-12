import java.lang.*;
import java.io.*;
import java.util.*;

class RelativeSorting {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int size_a = sc.nextInt();
            int size_ref = sc.nextInt();
            int [] a = new int[size_a];
            int [] ref = new int[size_ref];
            
            
            
            for ( int i = 0; i < size_a; i++ )
                a[i] = sc.nextInt();
            for ( int i = 0; i < size_ref; i++)
                ref[i] = sc.nextInt();
            
            ArrayList<Integer> extras = new ArrayList<>();
            for ( int i = 0; i < size_ref; i++ ) {
                for ( int j = 0; j < size_a; j ++ ) {
                    if ( a[j] == ref[i] ) {
                        System.out.print(a[j] +" ");
                        a[j] = -1;   
                    }
                }
            }    
            
            for ( int i = 0; i < size_a; i++) {
                if ( a[i] != -1 )
                    extras.add(a[i]);
            }
            Collections.sort(extras);
            
            for ( Integer i : extras)
                System.out.print(i+" ");
            
            System.out.println();
            
            
        *
        }
    }
}
