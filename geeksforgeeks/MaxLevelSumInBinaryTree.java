/*Complete the finction below
Node is as follows
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG {
	public static int maxLevelSum(Node root) {
        LinkedList<Node> queue = new LinkedList<Node>();
        LinkedList<Integer> safety = new LinkedList<Integer>();
        
        Node head = root;
        queue.add(head);
         safety.add(head.data);
         
        queue.add(new Node(-9999));
         safety.add(-9999);
         
        while ( queue.size() >  1) {
            Node element = queue.removeFirst();
            if ( queue.getFirst().data == - 9999) {
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
                queue.add(new Node(-9999));
                 safety.add( -9999);
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
            }
        }
        int del = safety.removeLast();
        int max = 0;
        int temp = 0;
        for (int i = 0; i < safety.size(); i++ ) {
            if ( safety.get(i) != -9999 )
                temp += safety.get(i);
            else {
                if ( temp > max){
                    max = temp;
                }
                temp = 0;
            }
        }
        //System.out.println(safety);
        return max;
	}
}
