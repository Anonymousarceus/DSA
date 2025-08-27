class Solution {
    public int subarraySum(int[] nums, int k) {
        int cs=0;
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;++i){
            cs+=nums[i];
            if(hm.containsKey(cs-k)){
                count+=hm.get(cs-k);
                
            }
            
                hm.put(cs,hm.getOrDefault(cs,0)+1);
            
        }
        return count;
        
    }
}