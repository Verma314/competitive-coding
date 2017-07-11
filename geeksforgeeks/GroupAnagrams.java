import java.lang.*;
import java.io.*;
import java.util.*;

class GroupAnagrams {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            String [] alph = new String[n];
            
            HashMap<String, Integer> map = new HashMap<>();
            for ( int i = 0; i < n; i++ ) {
                String temp = sc.next();
                char[] chars = temp.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                if ( map.get(sorted) == null ) 
                    map.put( sorted, 1 );
                else
                    map.put( sorted, map.get(sorted)+ 1);
            }    
            
            ArrayList<Integer> toPrint = new ArrayList<>();
            for ( Integer i : map.values() )
                toPrint.add(i);
                
            Collections.sort(toPrint);
            
            for ( Integer i : toPrint)
                System.out.print(i+ " ");
            System.out.println();
        }
    }
}
