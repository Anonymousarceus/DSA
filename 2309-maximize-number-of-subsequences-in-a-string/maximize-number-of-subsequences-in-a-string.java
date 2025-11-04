class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        int  n= text.length();

        long cur = 0,ans = 0;
        char a = pattern.charAt(0), b = pattern.charAt(1);
        // starting a ;
        if(a == b){
            
            for(char ch : text.toCharArray()){
                if(ch == a){
                    ans ++;
                }
            }
            return (ans*(ans+1))/2;
        }
        cur = 1;
        for(char ch : text.toCharArray()){
            if(ch == a){
                cur ++;
            }
             else if(ch == b){
                ans += cur;
            }
        }

        long ans2 = 0;
        cur = 0;

        for(char ch : text.toCharArray()){
            if(ch == a){
                cur ++;
            }
            else if(ch == b){
                ans2 += cur;
            }
        }
        ans2 += cur;

        long res = Math.max(ans,ans2);
        return res;
    }
}