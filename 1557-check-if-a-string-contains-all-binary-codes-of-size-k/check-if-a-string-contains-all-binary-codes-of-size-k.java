class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String>hs=new HashSet<>();
        int n=s.length();
        for(int i=0;i<=n-k;++i){
            hs.add(s.substring(i,i+k));
        }
        return hs.size()==Math.pow(2,k);
    }
}