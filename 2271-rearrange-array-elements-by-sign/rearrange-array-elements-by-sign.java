class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int k=1,j=0;
        for(int i=0;i<n;++i){
            if(nums[i]>0){
                arr[j]=nums[i];
                j+=2;
            }
            else if(nums[i]<0){
                arr[k]=nums[i];
                k+=2;
            }
        }
        return arr;
    }
}