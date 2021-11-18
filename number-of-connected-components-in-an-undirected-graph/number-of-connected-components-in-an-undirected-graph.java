class Solution {
    
    public int countComponents(int n, int[][] edges) {
        int [] parent=new int[n];
        
        //all nodes are disjoint to start with
        for(int i=0;i<n;i++)
            parent[i]=i;
        
        for(int i=0;i<edges.length;i++){
            //call to find roots
            int num1=find(parent, edges[i][0]);
            int num2=find(parent, edges[i][1]);
            //check for union
            if(num1!=num2){
                n--;
                parent[num2]=num1;
            }
        }
        return n;
    }
    
    public int find(int []parent, int num){
    
        while(parent[num]!=num){
            parent[num]=parent[parent[num]];
            num=parent[num];
        }
        return num ;
    }
}