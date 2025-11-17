class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int lastI=-1;
        for(int i=0;i<n;++i){
            if(nums[i]==1){
                if(lastI!=-1){
                    if(i-lastI<=k){
                        return false;
                    }
                }
                lastI=i;
            }

        }
        return true;
    }
}



// class Solution {
//     public boolean kLengthApart(int[] nums, int k) {
//         int n=nums.length;
//         // int count=0;
//         for(int i=0;i<n;++i){
//             if(nums[i]==1){
//                 for(int j=i+1;j<n;++j){
//                     if(nums[j]==1&&j-i<=k){
//                         return false;
//                     }
//                 }
//             }

//         }
//         return true;
//     }
    
// }