class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Check if the matrix is empty or null, return 0 as no area can be calculated.
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        
        int rows = matrix.length;  // Number of rows in the matrix.
        int cols = matrix[0].length;  // Number of columns in the matrix.
        
        // 'heights' array represents the height of the bars in a histogram for each column.
        // Initialize it with cols + 1 elements (extra space for easier calculation).
        int[] heights = new int[cols + 1]; 
        int maxArea = 0;  // To store the maximum area found.
        
        // Iterate through each row of the matrix.
        for (char[] row : matrix) {
            // Update the 'heights' array for the current row.
            // If the current cell is '1', increase the corresponding height.
            // If the current cell is '0', reset the height to 0.
            for (int i = 0; i < cols; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }
            
            // Now calculate the largest rectangular area for this updated 'heights' array,
            // treating it as a histogram.

            int n = heights.length; // Number of bars (columns) in the histogram (including the extra element).
            
            // Iterate through every possible pair of columns (i, j) to form a rectangle.
            for (int i = 0; i < n; i++) {
                for (int j = i, minHeight = Integer.MAX_VALUE; j < n; j++) {
                    // Keep track of the smallest height within the current range of columns.
                    minHeight = Math.min(minHeight, heights[j]);
                    
                    // Calculate the area of the rectangle formed by the columns i and j.
                    int area = minHeight * (j - i + 1);
                    
                    // Update the maxArea if a larger area is found.
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        
        // Return the largest rectangle area found.
        return maxArea;
    }
}
