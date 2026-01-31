class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=target-'a';
        for(char c:letters){
            int x=c-'a';
            if(x>n){
                return c;
            }
        }
        return letters[0];
    }
}