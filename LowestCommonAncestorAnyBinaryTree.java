

class LowestCommonAncestorAnyBinaryTree {
	Node LCA(Node node, int n1,int n2) {
        if ( node == null )
	        return null;
	    
	    if ( node.data == n1 || node.data == n2) 
	        return node;
	    
	    Node leftLCA = LCA(node.left, n1, n2);
	    Node rightLCA = LCA(node.right, n1, n2);
	    
	    if ( leftLCA != null && rightLCA != null )
	           return node;
	    
        return ( leftLCA != null ) ? leftLCA : rightLCA;

	}
}
