import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            
            
            HashMap<Integer, Integer > map = new HashMap<>();
            int [] a = new int[n];
            for ( int i = 0; i < n; i ++ ) {
                a[i] = sc.nextInt();
                
                if ( map.get(a[i]) == null )
                    map.put(a[i],1);
                else
                    map.put (a[i],  map.get(a[i]) + 1 );
                
            }
            
            List <Integer> ans = new ArrayList<>();
            for ( Integer i : map.keySet() ) {
                if ( map.get(i) % 2 == 0 )
                    ans.add(i);
            }
            
            Collections.sort(ans);
            
            for ( Integer i : ans)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
