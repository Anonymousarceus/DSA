class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int idx=0;
        int n=strs.length;
        String x=strs[0];
        String y=strs[n-1];
        int i=0;
        while(i<Math.min(x.length(),y.length())){
            if(x.charAt(i)==y.charAt(i)){
                // ++idx;
                ++i;
            }
            else{
                break;
            }
        }
        return x.substring(0,i);
    }
}