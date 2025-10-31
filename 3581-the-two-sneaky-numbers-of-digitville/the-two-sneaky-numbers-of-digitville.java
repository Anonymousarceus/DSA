class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[]=new int[2];
        int n=nums.length;
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<n-1;++i){
            if(nums[i]==nums[i+1]){
                ans[j]=nums[i];
                ++j;
            }
        }
        return ans;
    }
}