import java.io.*;
import java.lang.*;
import java.util.*;
class GFG {public int fact
(int n)
    {int ans = 1;for 
    (
        int i = 1; i <= n; i++ )    
        ans = ans * i;return ans;}
        public static void main 
        (
            String [] args ) {Scanner sc
            = new Scanner (System.in);
    int t = sc.
    nextInt();List <Integer> LIST = 
    new ArrayList 
    <>();GFG 
    obj = new 
        GFG(); for
        (
            int i =
            1; i <= 
            8
           ; i++) 
           
           
           {
            LIST
            .
            add 
                (
                obj.fact
                
        
                
                (i             ) )
                
                
                
                
                
                
                ;    
        }
            
        while 
        ( 
            
            
            
            t-- > 
            
            
            
            
            
            0 ){
            int 
            
            
            n = 
            
            
            sc.
            
            
            nextInt();if ( 
                
                
                LIST
                
            
                .
                    contains(new 
            
            
            Integer(n
            )))
                System.
                
                
                
                out.
                
                
                
println(1)                        ;else
                System            .         out.
                
                
                
                println(
                    0
                    )
                    ;
            
        }
    }
}
