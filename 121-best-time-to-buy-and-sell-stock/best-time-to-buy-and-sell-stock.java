class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int n=prices.length;
        int minP=Integer.MAX_VALUE;
        for(int i=0;i<n;++i){
            minP=Math.min(minP,prices[i]);
            ans=Math.max(ans,prices[i]-minP);
        }
        return ans;
    }
}