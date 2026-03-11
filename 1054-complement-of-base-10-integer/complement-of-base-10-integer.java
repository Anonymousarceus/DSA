class Solution {
    public int bitwiseComplement(int n) {
        String x=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(char c:x.toCharArray()){
            if(c=='1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        String y=sb.toString();
        return Integer.parseInt(y,2);
    }
}