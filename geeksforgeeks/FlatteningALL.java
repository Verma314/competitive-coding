class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	
	Node parentPtr = root;
	Node nextParentPtr = root.next;
	
	Node childPtr = parentPtr;
	while ( parentPtr != null) {
	    while( childPtr != null)  {
	        if ( childPtr.bottom == null) {
	            childPtr.bottom = nextParentPtr;
	        }
	        childPtr = childPtr.bottom;
	        parentPtr = parentPtr.next;
	        nextParentPtr = parentPtr.next;
	    }
	}
	

    }
}
