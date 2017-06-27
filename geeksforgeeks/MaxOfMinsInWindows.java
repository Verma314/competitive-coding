import java.lang.*;
import java.io.*;
import java.util.*;

class MaxOfMinsInWindows {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            while ( n-- > 0)
                a.add(sc.nextInt());
            
            for ( int i = 1; i <= a.size() ; i++ ) {
              //  System.out.println("Window size "+i);
                ArrayList<Integer> mins = new ArrayList<>();
                for ( int j = 0; j <= a.size(); j++ ) {
                  //  int x = (Collections.min( a.subList(j,Math.min(j+i,a.size() ) )));
                    int startPt = j;
                    int endPt = j+ i;
                    if ( endPt == a.size() +1)
                        break;
                                    
                   // System.out.println("min list"+ a.subList(j,j+i) );                
                    mins.add( Collections.min(a.subList(j,j+i) ) );
                }
                
                if ( mins.size() > 0 )
                System.out.print(Collections.max(mins)+" " );
            }
            System.out.println();
        }
    }
}
