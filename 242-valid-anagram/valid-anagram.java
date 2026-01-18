class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!hm.containsKey(c)){
                return false;
            }
            hm.put(c,hm.get(c)-1);
            if(hm.get(c)==0){
                hm.remove(c);
            }
        }
        return hm.size()==0;
    }
}