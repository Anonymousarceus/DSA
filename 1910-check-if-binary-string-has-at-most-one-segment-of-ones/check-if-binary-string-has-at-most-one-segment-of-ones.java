class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        int count1=0;
        if(s.charAt(0)=='0'){
            return false;
        }
        for(int i=0;i<n;++i){
            if(s.charAt(i)=='1'){
                ++count1;
            }
        }
        if(count1==1){
            return true;
        }
        for(int i=0;i<count1;++i){
            if(s.charAt(i)!='1'){
                return false;
            }
        }
        return true;

    }
}