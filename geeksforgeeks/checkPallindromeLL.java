public class GfG
{
    
        public static boolean checkPallin (int[]  x, int len ) {
            int flag = 1;
            for ( int i = 0; i < len; i++) {
                if ( x[i] != x[len-i-1] )  {
                    flag = -1;
                    break;
                }
            }
           if ( flag == 1)
                return true;
            else
                return false;
        }    
            
        
        boolean isPalindrome(Node head)  {
                Node starter = head;
                Node traverser;
                int maxsize = 1, size = 0;
                int [] x; int counter;
                x = new int[100];
                counter = 0;
                x[counter] =   starter.data;
                counter++;
                traverser = starter.next;
                    
                while ( traverser != null){
                        x[counter] =  traverser.data;
                        counter++;
                        traverser = traverser.next;
                }    
               
               return ( checkPallin(x,counter) );
        }
}
