class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!hs.contains(c)){
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
            else{
                hm2.put(c, hm2.getOrDefault(c, 0) + 1);
            }
        }
        
        int max1 = 0;
        int max2 = 0;
        
        for (Map.Entry<Character,Integer> x : hm.entrySet()){
            max1 = Math.max(max1, x.getValue());
        }
        
        for (Map.Entry<Character,Integer> y : hm2.entrySet()){
            max2 = Math.max(max2, y.getValue());
        }
        
        return max1 + max2;
    }
}