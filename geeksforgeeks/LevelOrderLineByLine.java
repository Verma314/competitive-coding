class GfG {
    void levelOrder(Node root)  {
        
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
        for ( int i = 0; i < safety.size()-1; i++ ) {
            if ( safety.get(i) == -1)
                System.out.print("$ ");
            else
                System.out.print(safety.get(i)+" ");
        }
    }
}
