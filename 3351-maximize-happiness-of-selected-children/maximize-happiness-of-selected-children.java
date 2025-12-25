class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long score=0;
        int n=happiness.length;
        for(int i=0;i<k;++i){
            long currV=happiness[n-1-i]-i;
            if(currV>0){
                score+=currV;
            }
            else{
                break;
            }
            
        }
        return score;


    }
}