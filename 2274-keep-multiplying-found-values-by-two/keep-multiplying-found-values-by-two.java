class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        int x=original;
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        
        while(hs.contains(x)){
            x=x*2;
        }
        return x;
    }
}