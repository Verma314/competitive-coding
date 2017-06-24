class GfG {
    void connect(Node root) {
        LinkedList<Node> queue = new LinkedList<Node>();
        Node head = root;
        queue.add(head);
        queue.add(new Node(-1));
        while ( queue.size() >  1) {
            Node element = queue.removeFirst();
            if ( queue.getFirst().data == -1 ) {
                element.nextRight = null;
                Node del = queue.removeFirst();
        
                if ( element.left != null)
                    queue.add(element.left);
                if (element.right != null)
                    queue.add(element.right);
                
                queue.add(new Node(-1));
            }
            else {
                if ( element.left != null)
                    queue.add(element.left);
                if (element.right != null)
                    queue.add(element.right);                
                
                element.nextRight = queue.get(queue.indexOf(element) + 1 );
            }
        }
        
    }
    
    
}
