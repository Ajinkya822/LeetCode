class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j,count);
                    //return count;
                }
            }
        }
        
        return count;
    }
    public void dfs(char[][] grid, int row, int col, int count){
        
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length)
            return;
        
        if(grid[row][col]=='1'){
            grid[row][col]='0';
            dfs(grid,row,col-1,count);//left
            dfs(grid,row,col+1,count);//right
            dfs(grid,row-1,col,count);//up
            dfs(grid,row+1,col,count);//down
        }
    }
}