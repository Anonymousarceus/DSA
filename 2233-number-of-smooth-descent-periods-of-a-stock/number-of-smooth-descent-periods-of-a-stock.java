class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long count=0;
        int len=1;
        for(int i=0;i<n;++i){
            if(i>0 && prices[i-1]-prices[i]==1){
                ++len;
            }
            else{
                len=1;
            }
            count+=len;

        }

        return count;
    }
}