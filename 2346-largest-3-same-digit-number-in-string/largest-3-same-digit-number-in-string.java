class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        
        for(int i = 0; i <= num.length() - 3; i++) {
            String current = num.substring(i, i + 3);
            if(isValid(current)) {
                if(ans.equals("") || current.compareTo(ans) > 0) {
                    ans = current;
                }
            }
        }
        return ans;
    }
    
    public boolean isValid(String str) {
        if(str.length() == 3) {
            return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
        }
        return false;
    }
}