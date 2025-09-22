class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;++i){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(Map.Entry<Integer,Integer>x:hm.entrySet()){
            al.add(x.getValue());
        }
        Collections.sort(al);
        for(int i=al.size()-1;i>=0;--i){
            count+=al.get(i);
            if(i>0 && al.get(i)!=al.get(i-1)){
                break;
            }
            
        }
        return count;
    }
}