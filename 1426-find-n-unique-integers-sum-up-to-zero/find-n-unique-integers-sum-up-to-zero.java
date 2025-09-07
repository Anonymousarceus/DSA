class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        
        ArrayList<Integer>al=new ArrayList<>();
        if(n%2!=0){
            al.add(0);
        }
        for(int i=1;i<=n/2;++i){
            al.add(i);
            al.add(-i);
        }
        for(int i=0;i<n;++i){
            arr[i]=al.get(i);
        }
        return arr;
        
    }
}