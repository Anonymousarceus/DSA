class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character>hs=new HashSet<>();
        
        for(int i=0;i<brokenLetters.length();++i){
            hs.add(brokenLetters.charAt(i));
        }
        int count=0;
        String arr[]=text.split(" ");
        for(int i=0;i<arr.length;++i){
            boolean cT=true;
            for(int j=0;j<arr[i].length();++j){
                
                if(hs.contains(arr[i].charAt(j))){
                    cT=false;
                    break;

                }
            }
            if(cT){
                ++count;
            }
        }
        return count;

    }
}