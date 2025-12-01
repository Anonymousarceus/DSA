class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        String longest="";
        for(int i=0;i<s.length();++i){
            for(int j=i;j<s.length();++j){
                String sub=s.substring(i,j+1);
                if(isP(sub)&&sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }
        return longest;
    }
    public boolean isP(String sub){
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right)){
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}