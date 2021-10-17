class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)
            return 0;
        if(obstacleGrid[0][0]==1)
            return 0;
        
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1)
                    obstacleGrid[i][j]=-5;
            }
        }    
        //first row initialize
            obstacleGrid[0][0]=1;
            for(int col=1;col<obstacleGrid[0].length;col++){
                if(obstacleGrid[0][col]<0){
                    
                }
                else if(obstacleGrid[0][col-1]==1){
                    obstacleGrid[0][col]=1;
                }
                else{
                    obstacleGrid[0][col]=0;
                }
            }
          ////first column initialize  
            for(int row=1;row<obstacleGrid.length;row++){
                if(obstacleGrid[row][0]<0){
                    
                }
                else if(obstacleGrid[row-1][0]==1){
                    obstacleGrid[row][0]=1;
                }
                else{
                    obstacleGrid[row][0]=0;
                }
            }
        
        for(int row=1;row<obstacleGrid.length;row++){
            for(int col=1;col<obstacleGrid[0].length;col++){
                if(obstacleGrid[row][col]<0){
                    
                }
                else if(obstacleGrid[row-1][col]<0 && obstacleGrid[row][col-1]<0){
                    obstacleGrid[row][col]=0;
                }
                else if(obstacleGrid[row-1][col]<0){
                    obstacleGrid[row][col]=obstacleGrid[row][col-1];
                }
                else if(obstacleGrid[row][col-1]<0){
                    obstacleGrid[row][col]=obstacleGrid[row-1][col];
                }
                else{
                    obstacleGrid[row][col]=obstacleGrid[row][col-1]+obstacleGrid[row-1][col];
                }
            }
        } 
            
            
          return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]; 
        }
        
    }
