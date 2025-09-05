class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxL=0;
        int n=s.length();
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<n;++i){
            while(hs.contains(s.charAt(i))){
                
                hs.remove(s.charAt(left));
                ++left;
            }
            hs.add(s.charAt(i));
            maxL=Math.max(maxL,i-left+1);
        }
        return maxL;
    }
}