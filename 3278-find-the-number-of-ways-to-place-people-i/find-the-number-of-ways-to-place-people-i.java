class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){  // Should be 'n', not 'm'
                if(i == j){
                    continue;
                }
                
                int[] A = points[i];  // Array declaration fix
                int[] B = points[j];  // Array declaration fix
                
                // Check if A is upper-left of B
                if(A[0] <= B[0] && A[1] >= B[1]){
                    int x_min = A[0];
                    int x_max = B[0];
                    int y_min = B[1];
                    int y_max = A[1];
                    
                    boolean isEmpty = true;  // Move inside the if block
                    
                    for(int k = 0; k < n; k++){
                        if(k == i || k == j){
                            continue;
                        }
                        
                        int[] P = points[k];  // Array declaration fix
                        
                        // Fix comparison syntax - Java doesn't support chained comparisons
                        if (x_min <= P[0] && P[0] <= x_max && y_min <= P[1] && P[1] <= y_max){
                            isEmpty = false;
                            break;
                        }
                    }
                    
                    if(isEmpty){
                        count++;
                    }
                }  // Add missing closing brace
            }
        }
        return count;
    }
}