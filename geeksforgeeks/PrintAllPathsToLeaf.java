/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class PrintAllPathsToLeaf {
    
    
    public static void printArray(int array [], int pathLen ) {
        
        for ( int i = 0; i < pathLen; i++ ) 
            System.out.print(array[i]+" ");    
            
        System.out.print("#");
        
        
    }
    
    public static void printPaths(Node root, int array [], int pathLen) {
        
        if ( root == null)
            return;
            
        array[pathLen] = root.data;
        pathLen++;
        
        if ( root.left == null && root.right == null) {
            printArray(array, pathLen);
        }
        
        else {
            printPaths(root.left, array, pathLen);
            printPaths(root.right, array, pathLen);
        }
    }    
            
        
        

	public void printPaths(Node root) {
          int [] array = new int[1000];
          printPaths(root, array, 0);
       }
}

