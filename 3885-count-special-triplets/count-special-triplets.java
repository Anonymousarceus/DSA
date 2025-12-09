class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD=1000000007;
        int maxV=100000;
        long ans=0;
        int right[]=new int[maxV+1];
        int left[]=new int[maxV+1];
        for(int num:nums){
            right[num]++;
        }
        for(int j=0;j<nums.length;++j){
            int mid=nums[j];
            long tar=(long) mid*2;
            right[mid]--;
            if(tar<=maxV){
                ans=(ans+((long)left[(int)tar]*right[(int)tar])%MOD)%MOD;
            }
            left[mid]++;
        }
        return (int)ans;
       
    }
}