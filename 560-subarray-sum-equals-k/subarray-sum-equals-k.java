class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        
        for(int i=0;i<nums.length;++i){
            int cs=0;
            for(int j=i;j<nums.length;++j){
                cs+=nums[j];
                if(cs==k){
                    count++;
                }
            }
        }
        return count;
    }
}