class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long count=0;
        int len=1;
        for(int i=0;i<n-1;++i){
            if(prices[i]-prices[i+1]==1){
                ++len;
            }
            else{
                len=1;
            }
            count+=len;

        }

        return count+1;
    }
}