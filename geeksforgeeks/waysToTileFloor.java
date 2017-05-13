import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t -- > 0 ) {
            int w = sc.nextInt();
            long [] ans = new long[w];
            ans[0] = 1;
            ans[1] = 2;
            for ( int i = 2; i < w; i++ )
                ans[i] = ans[i-1] + ans[i-2];
            System.out.println(ans[w-1]);
            
        }
    }
}
