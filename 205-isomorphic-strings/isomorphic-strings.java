class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sa[]=new int[256];
        int ta[]=new int[256];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();++i){
            if(sa[s.charAt(i)]!=ta[t.charAt(i)]){
                return false;
            }
            sa[s.charAt(i)]=i+1;
            ta[t.charAt(i)]=i+1;
        }
        return true;
    }
}