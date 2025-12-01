class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<n;++i){
            cs+=nums[i];
            if(ms<cs){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
}