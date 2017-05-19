class IntersectionPointOf2LL
{
	int intersectPoint(Node headA, Node headB)
	{
         // code here
         int lenA = 0;
         int lenB = 0;
         Node ptr = headA;
         while ( ptr != null) {
             lenA++;
             ptr = ptr.next;
         }
         
         ptr = headB;
         while ( ptr != null ) {
             lenB++;
             ptr = ptr.next;
         }
         
        int diff;
        
        Node aStart = headA;
        Node bStart = headB;
        
        if ( lenA > lenB)  {
            ptr = headA;
            diff = lenA - lenB;
            while ( diff -- > 0)
                ptr = ptr.next;
            aStart = ptr;
            bStart = headB;
            
        }
        else if ( lenB > lenA)  {
            ptr = headB;
            diff = lenB - lenA;
            while ( diff -- > 0) 
                ptr = ptr.next;
            bStart = ptr;
        }
         
         
        while ( aStart != null) {
            if ( aStart == bStart)
                return aStart.data;
            
            aStart = aStart.next;
            bStart = bStart.next;
        }    
            
        return (-1);
	}
}
