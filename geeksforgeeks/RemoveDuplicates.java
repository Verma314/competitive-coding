class RemoveDuplicates {
    // You have to complete the method and print the 
    // array after removing duplicate elements
    void removeDuplicate(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();        
        for ( int i =0; i < arr.length; i++ )  {
            if ( map.get(arr[i]) == null ) {
                System.out.print(arr[i]+" ");
                map.put ( arr[i], 1);
            }
        }
    }
}
