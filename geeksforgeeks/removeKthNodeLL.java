class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k) {
        if ( k == 0)
            return head;
        if  ( k == 1) 
            return null;
        
        Node head0 = new Node(-1);
        head0.next = head;
        
        Node head1 = head0;
        Node head2 = head1.next;
        int i = 1;
        
        while (head2 != null ) {
            if ( i % k == 0 ) {
                head1.next = head2.next;
                head2 = head2.next;
                i++;
            }
            else {
                head2 = head2.next;
                head1 = head1.next;
                i++;
            }
        }
    
        return (head0.next);   
    }
}
