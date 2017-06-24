//http://practice.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1
class GfG
{
    static int min_element;
    static int min_value;

    public GfG(){
        min_element = 0;
        min_value = 9999;
    }

    static void postorder ( Node root,int k) {
        if ( root != null) {
            int temp = Math.abs(root.data-k);
            if ( temp < min_value) {
                min_value = temp;
                min_element = root.data;
            } 
            postorder(root.left,k);
            postorder(root.right,k);
        }
    }
        
        public static int maxDiff(Node root, int k) {
            postorder(root,k);  
            return min_element;
        }
}
