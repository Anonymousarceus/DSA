class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int x=0;
        int n=nums.length;
        for(int i=0;i<n/2;++i){
            x=nums[i]+nums[n-i-1];
            max=Math.max(x,max);
        }
        return max;
    }
}