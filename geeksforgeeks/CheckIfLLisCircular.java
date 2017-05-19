/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class CheckIfLLisCircular
{
    boolean isCircular(Node head)
    {
	Node slo = head; Node fast = head;
	
	while ( slo != null || fast != null ) {
	    if (slo.next == null)
	        return false;
	    else
	        slo = slo.next;
	    
	    if ( fast.next == null) 
	        return false;
	    
	    if ( fast.next.next == null)
	        return false;
	    else
	        fast = fast.next.next;
	    if ( slo == fast)
	        return true;
	   
	}
	return false;
	
	
	
    }
}
