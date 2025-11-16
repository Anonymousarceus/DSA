class Solution {
    public int numSub(String s) {
        int n=s.length();
        long cnt=0,total=0,mod=1000000007;
        for(int i=0;i<n;++i){
            if(s.charAt(i)=='1'){
                ++cnt;
            }
            else{
                cnt=0;
            }
            total=(total+cnt)%mod;
        }
        return (int) total;
    }
}