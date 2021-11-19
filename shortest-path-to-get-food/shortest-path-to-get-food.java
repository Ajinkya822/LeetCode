class Solution {
    int [][]directions=new int[][]{{-1,0} ,{0,1},{1,0},{0,-1}};
    public int getFood(char[][] grid) {
        boolean visited[][]=new boolean [grid.length][grid[0].length];
        int steps=0;
        Queue<int[]> q=new LinkedList<>();
        //find start position
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='*'){
                    q.add(new int[]{i,j});
                    break;
                }
            }
        }
        
        //bfs
        while(!q.isEmpty()){
            
            int count=q.size();
            
            while(count>0){
                int temp[]=q.poll();
                count--;
                if(!visited[temp[0]][temp[1]]){
                    visited[temp[0]][temp[1]]=true;
                    if(grid[temp[0]][temp[1]]=='#'){
                        return steps;
                    }
                    //steps++;
                    for(int [] dir:directions){
                        //upperbound
                        if(temp[0]+dir[0]>=0 && temp[0]+dir[0]<grid.length && temp[1]+dir[1]>=0 && temp[1]+dir[1]<grid[0].length){
                            if(grid[temp[0]+dir[0]][temp[1]+dir[1]]=='O' || grid[temp[0]+dir[0]][temp[1]+dir[1]]=='#' ){
                                q.add(new int[]{temp[0]+dir[0],temp[1]+dir[1]});    
                            }
                        
                        }
                    }
                }
            }
            steps++;
            
            
        }
        return -1;
    }
}

            
            
                
    
