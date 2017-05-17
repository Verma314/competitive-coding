class GfG
{
    Node removeDuplicates(Node head) {
        Node head0 = head;
        Node head1 = head0.next;
        
        while ( head1 != null ) {
            if ( head0.data == head1.data) {
                head0.next = head1.next;
                head1 = head0.next;
            }
            else {
                head1 = head1.next;
                head0 = head0.next;
            }
        }    
         return (head) ;
    }
}
