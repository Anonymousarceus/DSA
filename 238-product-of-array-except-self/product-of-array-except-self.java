class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int ans = 1;
        int zeroCount = 0;
        int zeroIndex = -1;
        
        // Count zeros and calculate product of non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            } else {
                ans = ans * nums[i];
            }
        }
        
        // Fill result array
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                // If more than one zero, all products are 0
                arr[i] = 0;
            } else if (zeroCount == 1) {
                // If exactly one zero, only that position gets the product
                if (i == zeroIndex) {
                    arr[i] = ans;
                } else {
                    arr[i] = 0;
                }
            } else {
                // No zeros, divide normally
                arr[i] = ans / nums[i];
            }
        }
        
        return arr;
    }
}