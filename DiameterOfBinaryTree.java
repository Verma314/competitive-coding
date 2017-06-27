class DiameterOfBinaryTree 
   /* Complete the function to get diameter of a binary tree */

    public static int height (Node node ) {
        if ( node == null )
            return 0;
            
        else 
            return ( 1 + Math.max(height(node.left), height(node.right) ) );
        
        
        
    }


    int diameter(Node node) {
        
        if ( node == null )
            return 0;
            
        int l_ht = height(node.left);
        int r_ht = height(node.right);
        
        int l_dia = diameter(node.left);
        int r_dia = diameter(node.right);
        
        
        return ( Math.max( l_ht+r_ht+1, Math.max(l_dia,r_dia) ) );
        
    }

}

