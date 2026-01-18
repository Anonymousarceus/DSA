class Solution {
    public int maxProfit(int[] prices) {
        int minP=Integer.MAX_VALUE;
        int maxP=0;
        for(int i:prices){
            minP=Math.min(minP,i);
            maxP=Math.max(maxP,i-minP);
        }
        return maxP;
    }
}