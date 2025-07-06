class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxC=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='('){
                ++count;
                if(maxC<count){
                    maxC=count;
                }
            }
            else if(s.charAt(i)==')'){
                --count;
            }
        }
        return maxC;
        
    }
}