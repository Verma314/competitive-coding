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
} */

class GfG {
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root) {
        
        if ( root == null) 
            return 0;
        
        if ( root.left == null && root.right == null)
            return 1;
            
        LinkedList<Node> queue = new LinkedList<Node>();
        LinkedList<Integer> safety = new LinkedList<Integer>();
        
        Node head = root;
        queue.add(head);
         safety.add(head.data);
         
        queue.add(new Node(-1));
         safety.add(-1);
         
        while ( queue.size() >  1) {
            Node element = queue.removeFirst();
            if ( queue.getFirst().data == -1 ) {
                //element.nextRight = null;
                Node del = queue.removeFirst();
        
                if ( element.left != null) {
                    queue.add(element.left);
                     safety.add(element.left.data);   
                }
                if (element.right != null) {
                    queue.add(element.right);
                     safety.add(element.right.data);
                }
                queue.add(new Node(-1));
                 safety.add( -1);
            }
            else {
                if ( element.left != null) {
                    queue.add(element.left);
                     safety.add(element.left.data);
                }
                if (element.right != null) {
                    queue.add(element.right);                
                     safety.add(element.right.data);
                }
                //element.nextRight = queue.get(queue.indexOf(element) + 1 );
            }
    
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < safety.size(); i++ ) {
            if ( safety.get(i) != -1 ) {
                temp++;
            }
            else {
                if ( temp >= max) {
                    max = temp;
                    temp = 0;
                }
            }
        }

        return max;
    }
}
    		

