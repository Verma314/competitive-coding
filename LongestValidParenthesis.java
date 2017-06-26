import java.lang.*;
import java.io.*;
import java.util.*;

class LongestValidParenthesis {
    
    static int checkSub( char arr[], int start, int end) {
        
        if ( arr[start] == ')')
            return 0;
        
        int teller = 0;
        int max = 0;
        for ( int i = start; i < end; i++) {
            if ( arr[i] == '(')
                teller++;
            else if ( arr[i] == ')')
                teller--;
            
            if ( teller == 0 )
                    max = i;
        
            if ( teller < 0)
                    return max-(start-1); 
        }
        return max- (start-1);
        
        
    }
    
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            String s = sc.next();

            char [] arr = new char[10001];
        
            ArrayList<Character> sizeAns = new ArrayList<>();
            
            for ( int i = 0; i < s.length(); i++ ) 
                arr[i] = s.charAt(i);
            int maxi = 0;
            for ( int i = 0; i < s.length()-1; i++ ) {
                int temp = checkSub(arr,i,s.length() );
                if ( temp > maxi)
                    maxi = temp;
            }
            System.out.println(maxi);


        }
    }
}
