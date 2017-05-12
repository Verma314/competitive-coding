import java.io.*;
import java.lang.*;
import java.util.*;
//cute
class GFG {
    public static void main(String [] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            String n = sc.next();
            List <Character> LIST = new ArrayList<>();
            LIST.add(n.charAt(0));
            for (int i = 1; i < n.length(); i++ ) {
                if (  n.charAt(i-1) != n.charAt(i) )
                    LIST.add(new Character(n.charAt(i)));
            }   
            for ( Character x : LIST) {
                System.out.print(x);
            }
            System.out.println();
    }
    }
}
