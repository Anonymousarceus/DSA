class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Long>al=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;++i){
            long a=nums[i];
            while(!al.isEmpty()){
                long last=al.get(al.size()-1);
                long cD=gcd(a,last);
                if(cD==1){
                    break;
                }
                a=al.remove(al.size()-1)*a/cD;
            }
            al.add(a);
            
        }
        List<Integer>ans=new ArrayList<>();
        for(long i:al){
            ans.add((int)i);
        }
        return ans;

    }
    public long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    // public int lcm(int a,int b){
    //     int ans=a*b/(gcd(a,b));
    //     return ans;
    // }
    // public boolean nCP(int a,int b){
    //     int x=gcd(a,b);
    //     return x>1?true:false;
        
    // }
}