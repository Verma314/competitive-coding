/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class GfG {
    static int answer;
    
    public GfG() {
        answer = 1;
        
    }
    static void inorder(Node a, Node b) {
        
        if ( a == null && b != null) {
            answer = 0;
            return;
        }
        else if ( a != null && b == null) {
            answer = 0;
            return;
        }
        else if ( a == null && b == null) {
            return;
        }
        else {
            inorder(a.left,b.left);
            if ( a.data != b.data) {
                answer = 0;
                return;
            }
            inorder(a.right,b.right);
            
        }
    }    
    
    boolean isIdentical(Node root1, Node root2) {
        inorder(root1,root2);    
        if ( answer == 1 ) 
            return  true;
        else
            return false;
    }
}
