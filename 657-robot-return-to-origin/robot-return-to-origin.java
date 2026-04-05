class Solution {
    public boolean judgeCircle(String moves) {
        int count=0;
        int count2=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                ++count;
            }
            else if(c=='D'){
                --count;
            }
            else if(c=='L'){
                --count2;
            }
            else if(c=='R'){
                ++count2;
            }
        }
        return count==0&&count2==0;
    }
}