class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        
        // Process each subarray of length k
        for(int i = 0; i <= n - k; i++) {
            ans[i] = calculateXSum(nums, i, i + k - 1, x);
        }
        
        return ans;
    }
    
    private int calculateXSum(int[] nums, int start, int end, int x) {
        // Count frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i = start; i <= end; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        
        // If less than x distinct elements, return sum of all
        if(freqMap.size() < x) {
            int sum = 0;
            for(int i = start; i <= end; i++) {
                sum += nums[i];
            }
            return sum;
        }
        
        // Create list of (element, frequency) pairs
        List<int[]> pairs = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pairs.add(new int[]{entry.getKey(), entry.getValue()});
        }
        
        // Sort by frequency (descending), then by value (descending)
        Collections.sort(pairs, (a, b) -> {
            if(a[1] != b[1]) {
                return b[1] - a[1]; // Higher frequency first
            }
            return b[0] - a[0]; // Higher value first if same frequency
        });
        
        // Calculate sum of top x elements
        int sum = 0;
        for(int i = 0; i < x; i++) {
            int element = pairs.get(i)[0];
            int frequency = pairs.get(i)[1];
            sum += element * frequency;
        }
        
        return sum;
    }
}