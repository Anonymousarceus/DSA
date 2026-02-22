class Solution {
    public int binaryGap(int n) {
        String x=Integer.toBinaryString(n);
        int cM=Integer.MIN_VALUE;
        int c=0;
        int xo=0;
        for(int i=0;i<x.length();++i){
            if(x.charAt(i)=='1'){
                for(int j=i+1;j<x.length();++j){
                    if(x.charAt(j)=='1'){
                        xo=j-i;
                        break;
                    }
                }
            }
            cM=Math.max(xo,cM);

            
        }
        return cM;
        
        

    }
}