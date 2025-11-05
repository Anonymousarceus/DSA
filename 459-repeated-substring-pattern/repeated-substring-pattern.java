class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String x=s+s;
        String y=x.substring(1,x.length()-1);
        return y.contains(s);
        
    }
}