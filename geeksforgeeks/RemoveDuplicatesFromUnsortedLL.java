class RemoveDuplicatesFromUnsortedLL extends java.util.ArrayList 
{
    Node removeDuplicates(Node head)
    {
         // Your code here
        ArrayList <Integer > hehe = new ArrayList<Integer>();
        Node ptr = head;
        Node ptr2 = ptr.next;
        
        hehe.add(ptr.data);
        
        while ( ptr2 != null ) {
            if ( hehe.contains(ptr2.data) ) {
                ptr.next = ptr2.next;
                ptr2 = ptr2.next;
            }
            else {
                hehe.add(ptr2.data);
                ptr = ptr.next;
                ptr2 = ptr2.next;
            }
        }
        return (head);
             
    }
}
