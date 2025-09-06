class Solution {
    
    /**
     * Calculate the sum of operations needed for all numbers from 1 to n
     * This uses the mathematical pattern that numbers in ranges [4^k, 4^(k+1)-1] need k operations
     */
    private long stepsum(long n) {
        // Base case: if n is 0 or negative, no numbers to process
        if (n <= 0) return 0;
        
        long res = 0;       // Total sum of operations for all numbers 1 to n
        long base = 1;      // Start of current level range (initially 1 for level 0)
        long step = 1;      // Number of operations needed for current level (initially 1 for level 0)
        
        // Process each level until we exceed n
        while (base <= n) {
            // Calculate how many numbers fall in current level within range [1, n]
            // Current level range is [base, base*4-1]
            // We want intersection of [base, base*4-1] and [1, n]
            long cnt = Math.min(n, base * 4 - 1) - base + 1;
            
            // Add contribution of this level: (count of numbers) × (operations per number)
            res += cnt * step;
            
            // Move to next level
            base *= 4;    // Next level starts at 4 times current base (4^0 → 4^1 → 4^2 ...)
            step++;       // Next level needs one more operation (0 → 1 → 2 → 3 ...)
        }
        
        return res;  // Return total sum of operations for numbers 1 to n
    }
    
    /**
     * Main function to solve the minimum operations problem
     */
    public long minOperations(int[][] queries) {
        long ans = 0;  // Final answer - sum of results for all queries
        
        // Process each query independently
        for (int[] q : queries) {
            long l = q[0];  // Left boundary of current query
            long r = q[1];  // Right boundary of current query
            
            // Calculate sum of operations for range [l, r] using prefix sum technique
            // stepsum(r) = sum for [1, r]
            // stepsum(l-1) = sum for [1, l-1]  
            // stepsum(r) - stepsum(l-1) = sum for [l, r]
            long total = stepsum(r) - stepsum(l - 1);
            
            // Each operation processes exactly 2 numbers simultaneously
            // So if total operations needed by all numbers is T, we need ceil(T/2) actual operations
            // (total + 1) / 2 is equivalent to ceil(total / 2) using integer arithmetic
            ans += (total + 1) / 2;
        }
        
        return ans;  // Return sum of minimum operations for all queries
    }
}