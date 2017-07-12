import java.lang.*;
import java.io.*;
import java.util.*;

class ReduceArray {
    
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int size = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            
            for ( int i = 0; i < size; i++ )  
                list.add(sc.nextInt());
            
            ArrayList<Integer> list_sort = new ArrayList<Integer>(list);
            Collections.sort( list_sort );
            
            for ( Integer i : list )
                System.out.print(list_sort.indexOf(i)+" ");
                
            System.out.println();  
        }
    }
}
