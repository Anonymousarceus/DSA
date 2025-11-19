class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        int x=original;
        HashSet<Integer>hs=new HashSet<>();
        for(int j=0;j<n;++j){
            for(int i=0;i<n;++i){
            if(nums[i]==x){
                x=x*2;
            }
        }
        }
        return x;
    }
}