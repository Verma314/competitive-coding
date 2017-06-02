import java.lang.*;
import java.io.*;
import java.util.*;

class p1 {
	public static void main (String [] args ) {
		Scanner sc = new Scanner (System.in);
		int dt = sc.nextInt();
		while ( dt --  > 0 ) {		

			int n = sc.nextInt();
			
			char A [] = new char [n];
			char B [] = new char [n];

			int i;


			int ans[] = new int [n];
			
			String a = sc.next();
			String b = sc.next();

	                for ( i = 0; i < n; i++ ) {
				A[i] =  a.charAt(i);
				if ( A[i] == '#')
					ans[i] = 1;
			}

			for ( i = 0; i < n; i++ ) {
				B[i] =  b.charAt(i);
				if ( B[i] == '#' )
					ans[i] = 1;
			}


			String soln = "false";

		
			//find first occurence	
			int firstOccurence = 0;
			for ( i = 0 ; i < n; i++ ) {
				if (  ans[i] == 1 ) {
					firstOccurence = i;
					break;                              
				}
			}

			//find lastOccurence
			int lastOccurence = n-1;
			for ( i = n-1; i >= 0; i-- ) {
				if ( ans[i] == 1) {
					lastOccurence = i;
					break;
				}
			}

			//go between first and last occurence and check if a zero exists between them
			
			int flag = 1,  flag2 = 1;

			for ( i = firstOccurence; i <= lastOccurence; i ++ ) {
				if ( ans[i] == 0 ) {
					flag = 0;
					break;
				}
			}


			if ( flag == 0 ) {
				System.out.println("no");
				continue;
			}



			ArrayList <Integer > pairs = new ArrayList<>();
			for ( i = firstOccurence; i <= lastOccurence; i++ ) {
				if ( A[i] == B[i] ) 
					pairs.add(i);
			}

			//for A
			char joy;

			if ( A[firstOccurence] == '#' ) 
				joy = '#';
			else
				joy = '.';
			
			for ( i = firstOccurence; i <= lastOccurence; i++ ) {
				if ( pairs.contains(i) ) {
					//flip joy
					if ( joy  == '.' )
						joy = '#';
					else
						joy = '.';
				}
				else {
					//not a pair
					if ( joy != A[i] )  {
						flag = 0;
						break;
					}
				}
			}

			if ( B[firstOccurence] == '#' ) 
				joy = '#';
			else
				joy = '.';
			
			for ( i = firstOccurence; i <= lastOccurence; i++ ) {
				if ( pairs.contains(i) ) {
					//flip joy
					if ( joy  == '.' )
						joy = '#';
					else
						joy = '.';
				}
				else {
					//not a pair
					if ( joy != B[i] )  {
						flag2 = 0;
						break;
					}
				}
			}
				
			if ( flag + flag2 == 0  ) 
				System.out.println("no");
			else
				System.out.println("yes");


		}
	}
}




























 
								
