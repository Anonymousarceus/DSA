class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int pref[]=new int[n+1];
        for(int i=1;i<=n;++i){
            pref[i]=pref[i-1];
            if(customers.charAt(i-1)=='N'){
                pref[i]++;
            }
        }
        int suff[]=new int[n+1];
        for(int i=n-1;i>=0;--i){
            suff[i]=suff[i+1];
            if(customers.charAt(i)=='Y'){
                suff[i]++;
            }
        }
        int minP=Integer.MAX_VALUE,best=0;
        for(int j=0;j<=n;++j){
            int p=pref[j]+suff[j];
            if(minP>p){
                minP=p;
                best=j;
            }
        }
        return best;
    }
}




// class Solution {
//     public int bestClosingTime(String customers) {
//         int n=customers.length();
//         int pen=0;
//         int minP=pen,minI=0;
//         for(int i=1;i<=n;++i){
//             int y=customers.charAt(i-1)=='Y'?1:-1;
//             pen-=y;
//             if(minP>pen){
//                 minP=pen;
//                 minI=i;
//             }
//         }
//         return minI;
//     }
    
// }