class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int MN=10001;
        for(int i=0;i<n;++i){
            arr[i]+=Integer.bitCount(arr[i])*MN;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;++i){
            arr[i]%=MN;
        }
        return arr;
    }
    
}