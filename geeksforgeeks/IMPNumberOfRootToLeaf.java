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
    
    static HashMap<Integer,Integer> map;
    public GfG(){
        map = new HashMap<Integer,Integer>();
        
    }
    
    void printArrayNormally(int array[], int l) {
        
        if ( map.get(l) != null ){
            map.put(l, map.get(l)+1);
        }
        else {
            map.put(l,1);
        }
        
        
    }
    
    void printRecur(Node node, int path[], int pathLen) {
        if ( node == null ){
            return;
        }
        
        path[pathLen] = node.data;
        pathLen++;
        
        if ( node.left == null && node.right == null) {
            //print array here
            printArrayNormally(path,pathLen);
        }
        else {
            printRecur(node.left,path,pathLen);
            printRecur(node.right,path,pathLen);
        }
    }    
        
        
    
    void countPaths(Node root) {
        int [] path = new int[500];
        printRecur(root,path,0);
        for ( Integer i : map.keySet() )
            System.out.print(i+" "+map.get(i)+" $");
    }
}
