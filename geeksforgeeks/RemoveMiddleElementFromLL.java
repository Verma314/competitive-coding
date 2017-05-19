
class RemoveMiddleElementFromLL {
   Node Delete(Node head) {
	   // This is method only submission.
           // You only need to complete the method.
        Node ptr = head;
        int count = 0 ;
        while ( ptr != null ) {
            count++;
            ptr = ptr.next;
        }
        int middle = (count)/2;
        int i = 0;
        Node ptrX = head;
        while ( true ) {
            i++;
            
            if ( i == middle) {
                ptrX.next = ptrX.next.next;
                break;
            }   
            ptrX = ptrX.next;
        }
        return head;
   }
}
