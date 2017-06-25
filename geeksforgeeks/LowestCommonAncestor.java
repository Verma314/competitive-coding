class LowestCommonAncestor {
  
  
 Node lca(Node node, int n1, int n2)  {
   	Node ptr = node;
		while ( true ) {
		    if ( n1 < ptr.data && n2 < ptr.data ) 
		        ptr = ptr.left;
		    else if ( n1 > ptr.data && n2 > ptr.data)
		        ptr = ptr.right;
		    else
		        return (ptr); 
		}
 }
}
