
class CheckIfTreeIsBalanced {

    static int height (Node node) {
  
        if ( node == null)
            return 0;
        if ( node.left == null && node.right == null) 
            return 1;
        else
            return (1 + Math.max(height( node.left), height(node.right) ) );
  
    } 
    
    boolean isBalanced(Node root) {
        if ( root == null)
            return true;
            
        int h_left = height(root.left);
        int h_right = height(root.right);

        if ( Math.abs(h_left-h_right) <= 1 && Math.abs(h_left-h_right) >= 0 ) 
            return true;
        else
            return false;
}
}
