class Solution {
    public int compress(char[] chars) {
        int i=0;
        int wI=0;
        while(i<chars.length){
            char cC=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==cC){
                ++i;
                ++count;
            }
            chars[wI++]=cC;
            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[wI++]=c;
                }
            }
        }
        return wI;
    }
}