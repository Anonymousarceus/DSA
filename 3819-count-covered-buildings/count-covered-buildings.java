class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int rMax[]=new int[n+1];
        int rMin[]=new int[n+1];
        int cMax[]=new int[n+1];
        int cMin[]=new int[n+1];
        Arrays.fill(rMin,n+1);
        Arrays.fill(cMin,n+1);
        for(int p[]:buildings){
            int x=p[0],y=p[1];
            rMax[y]=Math.max(rMax[y],x);
            rMin[y]=Math.min(rMin[y],x);

            cMax[x]=Math.max(cMax[x],y);
            cMin[x]=Math.min(cMin[x],y);
        }
        int count=0;
        for(int p[]:buildings){
            int x=p[0],y=p[1];
            if(x>rMin[y]&&x<rMax[y]&&y>cMin[x]&&y<cMax[x]){
                count++;
            }
        }
        return count;
    }
}


// class Solution {
//     public int countCoveredBuildings(int n, int[][] buildings) {
//         int r=buildings.length;
//         int count=0;
//         for(int i=0;i<r;++i){
//             int a=buildings[i][0];
//             int b=buildings[i][1];
//             if(a>n||b>n){
//                 continue;
//             }
//             boolean TopN=false;
//             boolean BottomN=false;
//             boolean LeftN=false;
//             boolean RightN=false;
//             for(int p[]:buildings){
//                 int x=p[0];
//                 int y=p[1];
//                 if(x==a&&y<b){
//                     TopN=true;
//                 }
//                 if(x==a&&y>b){
//                     BottomN=true;
//                 }
//                 if(x<a&&y==b){
//                     LeftN=true;
//                 }
//                 if(x>a&&y==b){
//                     RightN=true;
//                 }
//             }
//             if(TopN&&BottomN&&LeftN&&RightN){
//                 count++;
//             }
//         }
//         return count;
//     }
// }