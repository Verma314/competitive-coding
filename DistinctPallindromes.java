import java.lang.*;
import java.io.*;
import java.util.*;

class DistinctPallindromes {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            String s = sc.next();
            HashSet<String> answer = new HashSet<>();

            for ( int i = 0; i < s.length(); i++) {
                for ( int j = i+1; j <= s.length(); j++ ) {
                    String sub = s.substring(i,j);
                    if(sub.equals(new StringBuilder(sub).reverse().toString())) // is a palindrome.
                        answer.add(sub);
                }
                
            }
        System.out.println(answer.size());
            
        }
    }
}
