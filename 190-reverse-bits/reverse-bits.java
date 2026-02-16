class Solution {
    public int reverseBits(int n) {
        // int res=0;
        // for(int i=0;i<32;++i){
        //     res=res<<1;
        //     res=res|(n&1);
        //     n=n>>>1;
        // }
        // return res;
        String x=Integer.toBinaryString(n);
        while(x.length()<32){
            x="0"+x;
        }
        StringBuilder sb=new StringBuilder(x);
        sb.reverse();
        return (int)Long.parseLong(sb.toString(),2);
    }
}