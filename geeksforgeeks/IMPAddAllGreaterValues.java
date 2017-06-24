//http://practice.geeksforgeeks.org/problems/add-all-greater-values-to-every-node-in-a-bst/1

// A Binary Search Tree node
/* class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class GfG  {
    
    static int[] list1;
    static int[] list2;
    
    static int size1,size2;
    
    public GfG() {
        list1 = new int[100];
        list2 = new int[100];
        size1 = size2 = 0;
    }
    
    static void inorder(Node node ) {
        if ( node != null ) {
            inorder(node.right);
            list1[size1] = node.data;
            size1++;
            inorder(node.left);
        }
    }
    static void modifiedInorder(Node node ) {
        if ( node != null ) {
            modifiedInorder(node.left);
            node.data = list2[size1-1];
            size1--;
            modifiedInorder(node.right);
        }
    }
    
    void modify(Node root) {
        inorder(root);
        list2[0] = list1[0];
        for ( int i = 1; i < size1; i++) 
            list2[i] = list1[i] + list2[i-1]; 
        
    
        modifiedInorder(root);
        
    }
}
