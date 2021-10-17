class Solution {
    public int uniquePaths(int m, int n) {
        int row=m;
        int col=n;
        int[][] grid=new int[row][col];
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(r==0){
                    if(c==0){
                        grid[r][c]=1;
                    }
                    else{
                        grid[r][c]+=grid[r][c-1];
                    }
                }
                else if(c==0){
                    grid[r][c]+=grid[r-1][c];
                }
                else{
                    grid[r][c]=grid[r][c]+grid[r-1][c]+grid[r][c-1];
                }
            }
        }
        return grid[row-1][col-1];
    }
}