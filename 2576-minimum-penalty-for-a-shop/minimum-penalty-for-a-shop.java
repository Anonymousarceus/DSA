class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int pen=0;
        int minP=pen,minI=0;
        for(int i=1;i<=n;++i){
            int y=customers.charAt(i-1)=='Y'?1:-1;
            pen-=y;
            if(minP>pen){
                minP=pen;
                minI=i;
            }
        }
        return minI;
    }
}