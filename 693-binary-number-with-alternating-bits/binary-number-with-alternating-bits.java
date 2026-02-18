class Solution {
    public boolean hasAlternatingBits(int n) {
        String x=Integer.toBinaryString(n);
        for(int i=0;i<x.length()-1;++i){
            if(x.charAt(i)==x.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}