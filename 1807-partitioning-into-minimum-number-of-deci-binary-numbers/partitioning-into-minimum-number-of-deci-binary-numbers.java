class Solution {
    public int minPartitions(String n) {
        int m=n.length();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;++i){
            if(max<n.charAt(i)-'0'){
                max=(n.charAt(i)-'0');
            }
        }
        return max;
    }
}