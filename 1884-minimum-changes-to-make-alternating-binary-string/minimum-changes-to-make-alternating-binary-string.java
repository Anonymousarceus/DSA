class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int c1=0;
        int c2=0;
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<n;++i){
            if(i%2==0){
                sb.append('0');
                sb2.append('1');
            }
            else{
                sb.append('1');
                sb2.append('0');
            }
        }
        for(int i=0;i<n;++i){
            if(s.charAt(i)!=sb.charAt(i)){
                ++c1;
            }
            if(s.charAt(i)!=sb2.charAt(i)){
                ++c2;
            }
        }
        return Math.min(c1,c2);
    }
}