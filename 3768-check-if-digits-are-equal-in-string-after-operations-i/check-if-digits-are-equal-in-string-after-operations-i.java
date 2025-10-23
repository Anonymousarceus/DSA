class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>2){
            StringBuilder sbb=new StringBuilder();
            for(int i=0;i<sb.length()-1;++i){
                int x=Character.getNumericValue(sb.charAt(i));
                int y=Character.getNumericValue(sb.charAt(i+1));
                String z=String.valueOf((x+y)%10);
                sbb.append(z);
            }
            sb.setLength(0);
            sb.append(sbb);
        }
        return sb.charAt(0)==sb.charAt(1)?true:false;
    }

}