/*complete the given function*/
class CheckIfSubTree{
  
  public static boolean isIdentical (Tree a, Tree b ) {
      
      if ( a == null && b == null)
        return true;
      if ( a == null || b == null )
        return false;
        
      return ( a.data == b.data && isIdentical(a.left,b.left) 
                                && isIdentical(a.right, b.right ) );
      
      
      
  }
  
  
  public static boolean isSubtree(Tree T, Tree S)  {
    if ( S == null)
        return true;
    if ( T == null)
        return false;
        
    if ( isIdentical(T,S) )
        return true;
        
    else
        return ( isIdentical(T.left, S) || isIdentical(T.right, S) );
        
 }
}
