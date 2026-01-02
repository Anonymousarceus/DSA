// class Solution {
//     public int repeatedNTimes(int[] nums) {
//         int n=nums.length;
//         int x=n/2;
//         HashMap<Integer,Integer>hm=new HashMap<>();
//         for(int i:nums){
//             hm.put(i,hm.getOrDefault(i,0)+1);
//         }
//         for(Map.Entry<Integer,Integer>h:hm.entrySet()){
//             if(h.getValue()==x){
//                 return h.getKey();
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length - 2; i++)
            if (A[i] == A[i + 1] || A[i] == A[i + 2])
                return A[i];
        return A[A.length - 1];
    }
}
