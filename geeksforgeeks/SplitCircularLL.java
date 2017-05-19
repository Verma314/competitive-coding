class SplitCircularLL
{
        // Function  to split a circular LinkedList
	void splitList(circular_LinkedList list) {
	    Node midPtr;
	    
	    Node headPtrC = list.head;
	    
	    Node slowPtr = list.head;
	    Node fastPtr = list.head.next.next;
	    
	    while ( true ) {
	        if ( fastPtr == headPtrC || fastPtr == headPtrC.next) {
	            midPtr = slowPtr;
	            break;
	        }
	        else {
	            slowPtr = slowPtr.next;
	            fastPtr = fastPtr.next.next;
	        }
	    }
	    
	    //find the last node;
	    Node lastPtr = list.head.next;
	    while ( lastPtr.next != list.head) 
	        lastPtr = lastPtr.next;
 
	    list.head2 = midPtr.next;
	    lastPtr.next = list.head2;
	    
		midPtr.next = list.head;
	    list.head1 = list.head;
	    
	}
}
