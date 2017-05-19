

class IntersectionOfLL
{
    Intersect llist3 = new Intersect(); // object of LinkedList having Intersection of two LinkedLists
    // Function  to find Intersection of two LinkedLists
    void getIntersection(Node head1, Node head2)
    {   
         // Your code here
         int [] info = new int[35];
         Node ptr1 = head1;
         Node ptr2 = head2;
         
         while ( ptr1 != null ) {
             if ( info[ptr1.data] == 0)
                info[ ptr1.data ] +=1;
             ptr1 = ptr1.next;
         }
         
         while ( ptr2 != null ) {
             if ( info[ptr2.data] == 1)
                info[ ptr2.data] += 1;
             ptr2 = ptr2.next;
         }


         Node master = new Node(-1);
         llist3.head = new Node(-1);
         
         master.next = llist3.head;
         Node ptr = master.next;
         
         for ( int i = 0 ; i < 35; i++) {
            if ( info[i] >= 2 ) {
                ptr.next = new Node(i);
                ptr = ptr.next;
            }   
         }    
         llist3.head = llist3.head.next;
         
         
    }
}
