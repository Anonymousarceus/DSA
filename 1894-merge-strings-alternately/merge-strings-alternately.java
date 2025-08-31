class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int x=0,y=0;
        for(int i=0,j=0;i<word1.length() && j<word2.length();++i,++j){
            sb.append(word1.charAt(i));
            ++x;
            sb.append(word2.charAt(j));
            ++y;
        }
        if(word1.length()>word2.length()){
            for(int i=x;i<word1.length();++i){
                sb.append(word1.charAt(i));

            }
        }
        if(word1.length()<word2.length()){
            for(int i=y;i<word2.length();++i){
                sb.append(word2.charAt(i));

            }
        }
        
        return sb.toString();
    }
}