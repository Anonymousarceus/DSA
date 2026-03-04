class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count=0;
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if(mat[i][j]==1 ){
                    count+=solve(i,j,mat)==true?1:0;
                    
                }
            }
        }
        return count;
    }
    public boolean solve(int i,int j,int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        for(int x=0;x<m;++x){
            if((mat[i][x]==1&& x!=j )) {
                return false;
            }
            
        }
        for(int x=0;x<n;++x){
            if(( mat[x][j]==1 && x!=i)){
                return false;
            }
        }

        return true;
        
    }
}