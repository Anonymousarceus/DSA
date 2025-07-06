class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int max=-1;
        for(int i=0;i<arr.length;++i){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i:hm.keySet()){
            if(i==hm.get(i)){
                max=Math.max(i,max);
            }
        }
        return max;
    }
}