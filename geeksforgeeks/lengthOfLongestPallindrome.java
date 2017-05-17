/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}*/

public class GfG
{
    
        public static int checkPallin (int[]  x, int len ) {
            int flag = 1;
            for ( int i = 0; i < len; i++) {
                if ( x[i] != x[len-i-1] )  {
                    flag = -1;
                    break;
                }
            }
           if ( flag == 1)
                return len;
            else
                return -1;
            
        }    
            
        
        public static int maxPalindrome(Node head) {
            Node starter = head;
            Node traverser;
          
            int maxsize = 1, size = 0;
            int [] x; int counter;
          
            while  ( starter != null ) {
                x = new int[100];
                counter = 0;
                x[counter] =   starter.data;
                counter++;
                traverser = starter.next;
                    
                while ( traverser != null){
                        x[counter] =  traverser.data;
                        counter++;
                        size = checkPallin( x, counter);
                        if ( size > maxsize)
                            maxsize = size;
                        traverser = traverser.next;
                }    
                starter = starter.next;
          }
          return maxsize;
        }
}
