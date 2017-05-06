import java.util.*;
import java.lang.*;
import java.io.*;

class GFG3 {
	public static void main (String[] args) {
		//code
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while ( t-- > 0) {
        HashMap<Integer,Integer>  map =new HashMap<Integer,Integer> ();  

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        
        int [] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        
        int [] B = new int[m];
        for (int i = 0; i< m; i++)
            B[i] = sc.nextInt();
            
        int flag = 0;
        for ( int i = 0; i < n; i ++) {
            for ( int j = 0; j < m; j++) {
                if  ( A[i] + B[j] == x ) {
                    //System.out.println("putting,"+ A[i] + "<->" + B[j]);
                    map.put(A[i],B[j]);
                    flag = -1;
                }
            }
        }
        List<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
        Collections.sort(sortedKeys);
        
        int size = sortedKeys.size();
        
        for (int i = 0; i < size; i++) {
            if ( i != size-1)
            
                System.out.print(sortedKeys.get(i) +" "+map.get(sortedKeys.get(i))+", ");
            else
                System.out.println(sortedKeys.get(i)+" "+map.get(sortedKeys.get(i)));
                
            
        }
        
        
        if (flag == 0 )
            System.out.println("-1");

        
        
    }
    
    

	}
}
