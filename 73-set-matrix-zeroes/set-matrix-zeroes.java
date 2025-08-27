class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        boolean zeroP[][]=new boolean[rows][cols];
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                if(matrix[i][j]==0){
                    zeroP[i][j]=true;
                }
            }
        }
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                if(zeroP[i][j]){
                    for(int k=0;k<rows;++k){
                        matrix[k][j]=0;
                    }
                    for(int k=0;k<cols;++k){
                        matrix[i][k]=0;
                    }
                }
            }
        }
    }
}