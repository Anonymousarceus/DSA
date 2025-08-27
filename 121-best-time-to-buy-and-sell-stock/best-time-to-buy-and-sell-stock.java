class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int mp=0;
        int bp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;++i){
            

            if(bp<prices[i]){
                profit=prices[i]-bp;
                mp=Math.max(profit,mp);
            }    
            else{
                bp=prices[i];
            }     
            
        }
        return mp;
    }
}