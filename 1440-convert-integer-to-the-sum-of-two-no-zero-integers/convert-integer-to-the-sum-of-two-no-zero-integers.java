class Solution {
    public int[] getNoZeroIntegers(int n) {
        int ans[]=new int[2];
        int x=n;
        int a=0,b=0;
        for(int i=0;i<x;++i){
            a=i;
            b=n-a;
            if(a!=0 && b!=0 && noz(a)&&noz(b)){
                break;
            }
        }
        
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
    public boolean noz(int x){
        int l=0;
        while(x!=0){
            
            l=x%10;
            if(l==0){
                return false;
            }
            x=x/10;

        }
        return true;
    }
}