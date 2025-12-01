class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int ans=0;
        while(left<right){
            int width=right-left;
            int minH=Math.min(height[left],height[right]);
            ans=Math.max(ans,minH*width);
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