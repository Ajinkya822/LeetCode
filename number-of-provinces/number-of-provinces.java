class Solution {
    public int findCircleNum(int[][] isConnected) {
        //union find
        
        int op=isConnected.length;
        int []citiesParent=new int[isConnected.length];
        for(int i=0;i<citiesParent.length;i++)
            citiesParent[i]=i;
        
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1){
                    int root1=find(citiesParent,i);
                    int root2=find(citiesParent,j);
                    if(root1!=root2){
                        op--;
                        citiesParent[root2]=root1;
                    }
                }
                
            }
        }
        return op;
        
    }
    public int find(int[] citiesParent, int num){
        
        while(citiesParent[num]!=num){
            citiesParent[num]=citiesParent[citiesParent[num]];
            num=citiesParent[num];                //path compression
        }
        return num ;
    }
}