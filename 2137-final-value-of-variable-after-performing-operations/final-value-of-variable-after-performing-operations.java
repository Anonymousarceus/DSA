class Solution {
    public int finalValueAfterOperations(String[] operations) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("++X",1);
        hm.put("X++",1);
        hm.put("--X",-1);
        hm.put("X--",-1);
        int n=operations.length;
        int sum=0;
        for(int i=0;i<n;++i){
            sum+=hm.get(operations[i]);
        }
        return sum;
    }
}