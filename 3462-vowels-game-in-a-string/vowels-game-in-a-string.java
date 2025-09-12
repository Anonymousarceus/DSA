class Solution {
    public boolean doesAliceWin(String s) {
        HashSet<Character>hs=new HashSet<>();

        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        int count=0;
        for(int i=0;i<s.length();++i){
            if(hs.contains(s.charAt(i))){
                ++count;
            }
            
        }
        return count==0?false:true;
        
    }
}