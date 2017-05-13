import java.io.*;
import java.lang.*;
import java.util.*;
class GFG {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for ( int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            
            int maxer = arr[n-1];
            
            
            List<Integer> ans = new ArrayList<>();
            ans.add(maxer);
            for ( int i = n-2; i >= 0 ; i-- ) {
                if ( arr[i] > maxer) {
                    maxer = arr[i];
                    ans.add(maxer);
                }
            }
       
            int len = ans.size();
            for ( int i = len-1; i >= 0 ; i--)
                System.out.print(ans.get(i)+ " ");
                
            System.out.println();
            
        }
        
        
        
        
    }
}
