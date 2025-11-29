class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;++i){
            sum+=nums[i];
        }
        sum=sum%k;
        // if(sum==0){
        //     return 0;
        // }
        return sum;
        
    }
}