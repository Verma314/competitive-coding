//http://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1

class GfG {
	void reversePrint(Node root)  {
        
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
        safety.add(0, -1);

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for ( int i = safety.size()-3;     i >= 0;    i-- ) {
            if ( safety.get(i) != -1 )
                temp.add(safety.get(i));
            else {
                Collections.reverse(temp);
                for ( Integer z : temp)
                    System.out.print(z+" ");
                
                temp = new ArrayList<Integer>();
            }



        }
}      
       
}
