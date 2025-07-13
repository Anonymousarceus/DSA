/**
 * Solution for "Swim in Rising Water" problem using Dijkstra's Algorithm
 * 
 * Problem: You're in an n×n grid where each cell has an elevation. Water level rises over time.
 * At time t, you can only be in cells with elevation ≤ t. You can move in 4 directions.
 * Find the minimum time needed to reach from top-left (0,0) to bottom-right (n-1,n-1).
 * 
 * Key Insight: This is a shortest path problem where the "distance" is the maximum elevation
 * encountered along the path (because you need to wait for water to rise to that level).
 * 
 * Time Complexity: O(n² log(n²)) = O(n² log n) due to priority queue operations
 * Space Complexity: O(n²) for distance array and priority queue
 */
class Solution {
    public int swimInWater(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Distance array stores the minimum time needed to reach each cell
        // distance[i][j] = minimum time to reach cell (i,j) from (0,0)
        int[][] distance = new int[rows][cols];
        
        // Initialize all distances to infinity (maximum possible value)
        for (int i = 0; i < rows; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        
        // Min-heap priority queue to always process the cell with minimum time first
        // This is the core of Dijkstra's algorithm - greedy approach
        PriorityQueue<Pair> min_heap = new PriorityQueue<>((a, b) -> a.time - b.time);
        
        // Start from top-left corner (0,0)
        // Initial time is the elevation of starting cell (we must wait for water to reach this level)
        min_heap.offer(new Pair(grid[0][0], 0, 0));
        distance[0][0] = grid[0][0];
        
        // 4-directional movement: up, right, down, left
        int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        // Dijkstra's algorithm main loop
        while (!min_heap.isEmpty()) {
            // Always process the cell with minimum time (greedy choice)
            Pair current = min_heap.poll();
            int currentTime = current.time;
            int currentRow = current.row;
            int currentCol = current.col;
            
            // Early termination: if we reached the destination, return the time
            // Due to Dijkstra's property, this is guaranteed to be optimal
            if (currentRow == rows - 1 && currentCol == cols - 1) {
                return currentTime;
            }
            
            // Explore all 4 neighboring cells
            for (int[] dir : direction) {
                int nextRow = currentRow + dir[0];
                int nextCol = currentCol + dir[1];
                
                // Check if neighbor is within grid bounds
                if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols) {
                    // Calculate time needed to reach this neighbor
                    // We need to wait until water level reaches the maximum of:
                    // 1. Current time (time to reach current cell)
                    // 2. Elevation of neighbor cell
                    int timeToReachNeighbor = Math.max(currentTime, grid[nextRow][nextCol]);
                    
                    // Relaxation step: update if we found a better (shorter time) path
                    if (distance[nextRow][nextCol] > timeToReachNeighbor) {
                        distance[nextRow][nextCol] = timeToReachNeighbor;
                        min_heap.offer(new Pair(timeToReachNeighbor, nextRow, nextCol));
                    }
                }
            }
        }
        
        // Return the minimum time to reach bottom-right corner
        // This line should never be reached due to early termination above
        return distance[rows - 1][cols - 1];
    }
}

/**
 * Helper class to represent a cell with its minimum time and coordinates
 * Used in the priority queue for Dijkstra's algorithm
 */
class Pair {
    int time;   // Minimum time needed to reach this cell
    int row;    // Row coordinate
    int col;    // Column coordinate
    
    /**
     * Constructor for Pair
     * @param time Minimum time to reach this cell
     * @param row Row coordinate of the cell
     * @param col Column coordinate of the cell
     */
    Pair(int time, int row, int col) {
        this.time = time;
        this.row = row;
        this.col = col;
    }
}