class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>al=new ArrayList<>();
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;++i){
            x=(2*x+nums[i])%5;
            if(x==0){
                al.add(true);
            }
            else{
                al.add(false);
            }
        }
        return al; 
        

    }
}