class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        
        return "";
    }
}

// class Solution {
//     public String largestOddNumber(String num) {
//         String charToString=String.valueOf(num.charAt(num.length()-1));
//         int n=Integer.parseInt(charToString);
//         if(n%2!=0){
//             return num;
//         }
//         String ans="";
//         for(int i=num.length()-1;i>=0;--i){
//             String temp=String.valueOf(num.charAt(i));
//             int nu=Integer.parseInt(temp);
//             if(nu%2==0){
//                 ans=num.substring(0,i);
//             }
//             else{
//                 return ans;
//             }
//         }
//         return ans;
//     }
// }