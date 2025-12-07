class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int aS=0;
        for(int i:nums){
            aS+=i;
        }
        return sum-aS;
    }
}