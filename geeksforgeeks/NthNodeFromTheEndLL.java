
class NthNodeFromTheEndLL
{
    int getNthFromLast(Node head, int n)  {
	// Your code here	
	
	    //calculate no of nodes in LL
	    int count = 0;
	    Node ptr = head;
	    while ( ptr != null ) {
	        count++;
	        ptr = ptr.next;
	    }
	
	
	
	    int getTo = count - n + 1; 
	
	    if ( getTo <= 0)
	        return -1;
	        
	    int go = 0;
	    ptr = head;
	    while ( getTo -- > 1 ) 
	        ptr = ptr.next;
	       
	   return ptr.data;
	
    }
}
	
