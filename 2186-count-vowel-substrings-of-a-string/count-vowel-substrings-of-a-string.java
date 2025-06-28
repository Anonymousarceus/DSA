class Solution {
    public int countVowelSubstrings(String word) {
        int n=word.length();
        int ans=0;
        Set<Character>v=new HashSet<>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        for(int i=0;i<n;++i){
            Set<Character>seen=new HashSet<>();
            for(int j=i;j<n;++j){
                char c=word.charAt(j);
                if(!v.contains(c)){
                    break;
                }
                seen.add(c);
                if(seen.size()==5){
                    ans++;
                }
            }
            
        }
        return ans;
    }
}