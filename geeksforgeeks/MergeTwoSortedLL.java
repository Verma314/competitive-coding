
class MergeTwoSortedLL
{
    Node MergeLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
        if ( headA == null)
            return headB;
        if ( headB == null)
            return headA;
        if  (headA == null && headB == null)
            return null;

        Node ptr = headA;
        
        while ( true ) {
            if ( ptr.next == null) {
                ptr.next = headB;
                break;
            }
            ptr = ptr.next;
        }
    
        //do bubble sort
        Node ptr1 = headA; Node ptr2; int temp;
        while ( ptr1.next != null ) {
            ptr2 = ptr1.next;
            while ( ptr2 != null ) {
                if ( ptr1.data > ptr2.data) {
                    temp = ptr2.data;
                    ptr2.data = ptr1.data;
                    ptr1.data = temp;
                }
                ptr2 = ptr2.next;
            }
            ptr1 = ptr1.next;
        }    
        return (headA);
   } 
}
