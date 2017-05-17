/* Linked list Node
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class GfG
{
    Node deleteAllOccurances(Node head, int x)
    {
        Node head0 = new Node(-1);
        head0.next = head;
        
        Node head1 = head0;
        Node head2 = head0.next;
        
        while (head2 != null) {
            if ( head2.data == x ) {
                head1.next = head2.next;
                head2 = head2.next;
            }
            else {
                head2 = head2.next;
                head1 = head1.next;
            }
        }    
        return head0.next;
    }
}
