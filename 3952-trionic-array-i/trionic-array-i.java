class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int p = 0, q = 0, x = 0;
        
        // Find end of first increasing phase
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] < nums[i + 1]) {
                ++p;
            } else {
                break;
            }
        }
        
        // Find end of decreasing phase
        for (int i = p; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                ++q;
            } else {
                break;
            }
        }
        
        // Find end of second increasing phase
        for (int i = p + q; i < n - 1; ++i) {
            if (nums[i] < nums[i + 1]) {
                ++x;
            } else {
                break;
            }
        }
        
        // Check if all three phases exist and cover entire array
        return p > 0 && q > 0 && x > 0 && p + q + x == n - 1;
    }
}