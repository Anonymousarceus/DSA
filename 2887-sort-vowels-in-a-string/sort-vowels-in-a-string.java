class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        HashSet<Character>hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');

        ArrayList<Character>al=new ArrayList<>();
        for(int i=0;i<n;++i){
            if(hs.contains(s.charAt(i))){
                al.add(s.charAt(i));
            }
        }
        Collections.sort(al);


        int index = 0;  // Track position in sorted ArrayList
for(int i = 0; i < n; ++i){
    if(hs.contains(s.charAt(i))){
        sb.append(al.get(index));  
        index++;  // Move to next sorted character
    } 

            
            else if(!hs.contains(s.charAt(i))){
                sb.append(s.charAt(i));
            }

            
        }
        return sb.toString();
    }
    
}