class Solution {
    public int smallestNumber(int n) {
        int x=0;
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;++i){
            
            x=(int)Math.pow(2,i);
            if(x>n){
                break;
            }
            
            
        }
        return x-1;

    }

}