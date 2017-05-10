import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while ( t-- > 0 ) 
	 {
	     int n = in.nextInt();
	     List<Integer> list = new ArrayList<>();
	     while ( n-- > 0 ) 
	     {
	         int k = in.nextInt();
	         list.add(k);
	     }
	     Collections.sort(list);
	     for ( Integer i : list)
	         System.out.print(i+ " ");
	     System.out.println();
	 }
	 }
}
