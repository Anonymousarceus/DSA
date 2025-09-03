// class Solution {
//     public int numberOfPairs(int[][] points) {
//         int n = points.length;
//         int count = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){  
//                 if(i == j){
//                     continue;
//                 }
                
//                 int[] A = points[i];  
//                 int[] B = points[j];  
                
//                 if(A[0] <= B[0] && A[1] >= B[1]){
//                     int x_min = A[0];
//                     int x_max = B[0];
//                     int y_min = B[1];
//                     int y_max = A[1];
                    
//                     boolean isEmpty = true;  
                    
//                     for(int k = 0; k < n; k++){
//                         if(k == i || k == j){
//                             continue;
//                         }
                        
//                         int[] P = points[k];  
                        
                       
//                         if (x_min <= P[0] && P[0] <= x_max && y_min <= P[1] && P[1] <= y_max){
//                             isEmpty = false;
//                             break;
//                         }
//                     }
                    
//                     if(isEmpty){
//                         count++;
//                     }
//                 }  
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int numberOfPairs(int[][] points) {
        // Sort by x ascending, y descending
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });

        int n = points.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int top = points[i][1];
            int bot = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                int y = points[j][1];
                if (bot < y && y <= top) {
                    result++;
                    bot = y;
                    if (bot == top) break;
                }
            }
        }

        return result;
    }
}