class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;++i){
            String x=Integer.toBinaryString(i);
            int a=0;
            for(char c:x.toCharArray()){
                
                if(c=='1'){
                    ++a;
                }
            }
            if(isPrime(a)){
                ++count;
            }
            

        }
        return count;
    }
    public boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i<=n/2;++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
}