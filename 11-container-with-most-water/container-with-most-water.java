class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ans=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int cH=Math.min(height[left],height[right]);
            int width=right-left;
            int area=cH*width;
            ans=Math.max(area,ans);
            if(height[left]<height[right]){
            ++left;
            }
        else{
            --right;
        }
            
        }
        
        return ans;
    }
}


// class Solution {
//     public int maxArea(int[] height) {
//         int n=height.length;
//         int ans=0;
//         for(int i=0;i<n;++i){
//             for(int j=i+1;j<n;++j){
//                 int cW=j-i;
//                 int h=Math.min(height[i],height[j]);
//                 int cA=h*cW;
//                 ans=Math.max(cA,ans);
//             }
//         }
//         return ans;

//     }
// }