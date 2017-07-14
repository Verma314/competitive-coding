import java.lang.*;
import java.io.*;
import java.util.*;

class LongestPallindromeInString {
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            String s = sc.next();
            TreeMap<String,Integer> map = new TreeMap<>();

            int given_length = 0;
            String longest_string = "";
            for ( int i = 0; i < s.length(); i++) {
                for ( int j = i+1; j <= s.length(); j++ ) {
                    String sub = s.substring(i,j);
                    if(sub.equals(new StringBuilder(sub).reverse().toString())) // is a palindrome.
                        if ( sub.length() > given_length) {
                            longest_string = sub;      
                            given_length = sub.length();
                            map.put(sub, i);
                        }
                }
                
            }
           // System.out.println(map);
            System.out.println(longest_string);
        }
    }
}
