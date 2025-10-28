class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n;++i){
            if(nums[i]!=0){
                continue;
            }
            int dir[]={-1,1};
            for(int d:dir){
                int temp[]=nums.clone();
                int curr=i;
                int move=d;
                while(curr>=0 && curr<n){
                    if(temp[curr]==0){
                        curr+=move;
                    }
                    else{
                        temp[curr]--;
                        move=-move;
                        curr+=move;
                    }
                }
                boolean aZ=true;
                for(int num:temp){
                    if(num!=0){
                        aZ=false;
                        break;
                    }
                }
                if(aZ){
                    ++count;
                }
            }

        }
        return count;
    }
}