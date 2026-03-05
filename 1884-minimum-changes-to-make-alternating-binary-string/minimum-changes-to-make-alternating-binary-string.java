class Solution {
    public int minOperations(String s) {
        int c1=0,c2=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)-'0'!=(i%2)){
                ++c1;
            }
            if(s.charAt(i)-'0'==(i%2)){
                ++c2;
            }
        }
        return Math.min(c1,c2);
    }
}