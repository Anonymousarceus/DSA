class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;++i){
            int freq[]=new int[26];
            int dist=0;
            int maxF=0;
            for(int j=i;j<n;++j){
                int idx=s.charAt(j)-'a';
                if(freq[idx]==0){
                    ++dist;
                }
                ++freq[idx];
                maxF=Math.max(maxF,freq[idx]);
                int len=j-i+1;
                if(len==dist*maxF){
                    ans=Math.max(len,ans);
                }
            }
        }
        return ans;
    }
}