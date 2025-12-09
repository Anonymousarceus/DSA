class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD=1000000007;
        Map<Integer,Integer>hm1=new HashMap<>();
        Map<Integer,Integer>hm2=new HashMap<>();
        for(int v:nums){
            hm1.put(v,hm1.getOrDefault(v,0)+1);
        }
        long ans=0;
        for(int v:nums){
            int tar=v*2;
            int lCnt=hm2.getOrDefault(tar,0);
            hm2.put(v,hm2.getOrDefault(v,0)+1);
            int rCnt=hm1.getOrDefault(tar,0)-hm2.getOrDefault(tar,0);
            ans=(ans+(long)lCnt*rCnt)%MOD;
        }
        return (int)ans;
    }
}


// class Solution {
//     public int specialTriplets(int[] nums) {
//         final int MOD=1000000007;
//         int maxV=100000;
//         long ans=0;
//         int right[]=new int[maxV+1];
//         int left[]=new int[maxV+1];
//         for(int num:nums){
//             right[num]++;
//         }
//         for(int j=0;j<nums.length;++j){
//             int mid=nums[j];
//             long tar=(long) mid*2;
//             right[mid]--;
//             if(tar<=maxV){
//                 ans=(ans+((long)left[(int)tar]*right[(int)tar])%MOD)%MOD;
//             }
//             left[mid]++;
//         }
//         return (int)ans;
       
//     }
// }