import java.lang.*;
import java.io.*;
import java.util.*;

class KthLargestElementInStream {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int k = sc.nextInt();
            int size = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for ( int i = 0; i < size; i++ ){
                list.add( sc.nextInt() );
                
                ArrayList<Integer> temp;
                if ( list.size() >= k ) {
                    temp = new ArrayList<>(list);
                    Collections.sort(temp);
                    Collections.reverse(temp);
                    System.out.print(temp.get(k-1)+" ");
                }    
                else {
                    System.out.print("-1 ");
                }
            }
            
            System.out.println();
        }
    }
}
