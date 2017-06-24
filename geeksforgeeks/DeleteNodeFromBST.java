/* class Node
{
    int key;
    Node left, right;

    Node(int item)
    {
        key = item;
        left = right = null;
    }
}*/
class GfG {
    
        static int get_min(Node root) {
            int min = root.key;
            while (root.left != null) {
                min = root.left.key;
                root = root.left;
            }   
            return min;
        }
        
        
    
    Node deleteNode(Node root, int key) {
        if ( root == null) {
            return root;
        }
        else if ( root.key < key) {
            root.right = deleteNode(root.right,key);
        }
        else if ( root.key > key) {
            root.left = deleteNode( root.left, key);
        }    
        else {
            //found the node where root.key == key
            if ( root.right == null)
                return root.left;
            else if ( root.left == null)
                return root.right;
            
            root.key = get_min(root.right);
            root.right = deleteNode( root.right, root.key );
        }             
            
            
        return root;            
        
    }    
}
