/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */


class FindMiddleElementOfLL
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         // Your code here.
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
            
            if ( i == middle) 
                return ptrX.next.data;
    
            ptrX = ptrX.next;
        }
    
   }
}
