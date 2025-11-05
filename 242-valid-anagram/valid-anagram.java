class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>hm1=new HashMap<>();
        // HashMap<Character,Integer>hm2=new HashMap<>();
        for(char c:s.toCharArray()){
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!hm1.containsKey(c)){
                return false;
            }
            if(hm1.get(c)>1){
                hm1.put(c,hm1.get(c)-1);
                
            }
            else{
                hm1.remove(c);
            }

            
        }
        return hm1.isEmpty();
    }
}