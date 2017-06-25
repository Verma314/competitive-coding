/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


class GfG
{
    static LinkedList<Integer> list;
    static int pos;
    public GfG(){
        list = new LinkedList<Integer>();
        pos = 0;
        
    }
    static void inorder (Node node) {
        if ( node != null) {
            inorder(node.left);
            list.add(node.data);
            inorder(node.right);
        }
    }
    static void inorderModify(Node node){
        if ( node != null)     {
            inorderModify(node.left);
            node.data = list.get(pos);
            pos++;
            inorderModify(node.right);
        }
    }
    
    
    Node binaryTreeToBST(Node root) {
	   inorder(root);
	   Collections.sort(list);
	   //modify contents using list and inorderModify
	   inorderModify(root);
	   return root;
	   
    }
}
