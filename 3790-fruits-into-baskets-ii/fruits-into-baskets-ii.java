class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean valid[]=new boolean[fruits.length];
        int count=0;
        for(int i=0;i<baskets.length;++i){
            valid[i]=false;
        }
        for(int i=0;i<fruits.length;++i){
            for(int j=0;j<baskets.length;++j){
                if(fruits[i]<=baskets[j] && !valid[j]){
                    valid[j]=true;
                    break;
                }
                
            }
        }
        for(int i=0;i<baskets.length;++i){
            if(!valid[i]){
                ++count;
            }
        }
        
        return count;
    }
}