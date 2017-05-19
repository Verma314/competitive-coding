class DeleteWithoutHeadRef
{
    void deleteNode(Node del)
    {
        Node ptr = del;
        Node ptr2 = del.next;
        int count = 1;
        while ( ptr2 != null ) {
            ptr.data = ptr2.data;
            ptr = ptr.next;
            ptr2 = ptr2.next;
            count++;
        }
        int i = 1;
        ptr = del;
        while  ( true  ) {
            if ( i == count-1) {
                ptr.next = null;
                break;
            }
            ptr = ptr.next;
            i++;
        }
    }
}
