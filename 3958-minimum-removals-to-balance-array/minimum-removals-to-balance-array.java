class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int maxL=0;
        int n=nums.length;
        for(int j=0;j<n;++j){
            while((long)nums[j]>(long)nums[i]*k){
                ++i;
            }
            maxL=Math.max(maxL,j-i+1);
        }
        return n-maxL;
    }
}