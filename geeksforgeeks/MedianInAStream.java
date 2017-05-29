import java.lang.*;
import java.io.*;
import java.util.*;

class MedianInAStream {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int size = 0;
        ArrayList<Integer > list = new ArrayList<>();
        int mid1,mid2; int ans = 0;
        while ( n-- > 0) {
            list.add(sc.nextInt());
            Collections.sort(list);
            size = list.size();
            
            if ( size % 2 == 0  && size != 0) {
                mid2 = size/2;
                mid1 = mid2-1;
                ans = (list.get(mid2) + list.get(mid1) )/2;
                System.out.println(ans);
                
            }
            else {
                mid1 = size/2;
                ans = list.get(mid1);
                System.out.println(ans);
                
            }
        }
    }
}
