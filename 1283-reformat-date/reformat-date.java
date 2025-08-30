class Solution {
    public String reformatDate(String date) {
        String arr[]=date.split(" ");
        HashMap<String,String>hm=new HashMap<>();
        hm.put("Jan","01");
        hm.put("Feb","02");
        hm.put("Mar","03");
        hm.put("Apr","04");
        hm.put("May","05");
        hm.put("Jun","06");
        hm.put("Jul","07");
        hm.put("Aug","08");
        hm.put("Sep","09");
        hm.put("Oct","10");
        hm.put("Nov","11");
        hm.put("Dec","12");
        String year=arr[2];
        String month=hm.get(arr[1]);
        String day=arr[0].substring(0,arr[0].length()-2);
        if(day.length()==1){
            day="0"+day;

        }
        return year+"-"+month+"-"+day;
    }
}