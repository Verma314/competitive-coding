/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below*/
class MaximumSubsetXOR {
    
            static int answer;
            public GfG() {
                answer = 0;
                
            }
            public static void subsetSums ( int set[], int reached, int size, int sum )  {
                if ( sum >= answer)
                    answer = sum;
                
                if ( reached  == size ) {
                    return;
                    //compare and shit
                }

                
                //either include the next element in your subset XORsum or dont
                subsetSums ( set, reached+1, size, sum ^ set[reached]);
                subsetSums ( set, reached+1, size, sum);
                
                
                
            }
    
    
            public static int maxSubarrayXOR(int set[], int size) {
                //create subset sums.
                int reached = 0;
                int sum = 0;
                answer = 0;
                subsetSums( set, reached, size, sum );
                
                return(answer);
                
                
            }
}
