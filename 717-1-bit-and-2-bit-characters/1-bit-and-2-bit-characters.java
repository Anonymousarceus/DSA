class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int i = 0;
        for(;i<n-1;i++){
            if(bits[i]==1){
                i++;
            }

        }
        return i==n-1;
        
        
        
    }
}