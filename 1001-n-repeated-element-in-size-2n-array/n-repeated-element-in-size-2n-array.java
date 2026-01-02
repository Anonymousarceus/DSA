class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int x=n/2;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>h:hm.entrySet()){
            if(h.getValue()==x){
                return h.getKey();
            }
        }
        return -1;
    }
}