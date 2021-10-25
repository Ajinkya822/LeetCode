class Solution {
    public int minKnightMoves(int x, int y) {
        int steps=0;
        x=Math.abs(x);
        y=Math.abs(y);
        
        int []xval={2,1,-1,-2,-2,-1,1,2};
        int []yval={1,2,2,1,-1,-2,-2,-1};
        
        Set<String> visited=new HashSet<>();
        visited.add("0,0");
        
        Queue<int []> q=new LinkedList<int []>();
        int []curr={0,0};
        q.add(curr);
        
        while(q.size()>0){
            int qs=q.size();
            for(int i=0;i<qs;i++){
                int temp[]=q.remove();
                if((temp[0]==x) && (temp[1]==y))
                    return steps;
                for(int j=0;j<8;j++){
                    int xord=temp[0]+xval[j];
                    int yord=temp[1]+yval[j];
                    int buf[]={xord,yord};
                    if(((xord>=-1) && (yord>=-1)) && (!visited.contains(xord+","+yord))){
                        q.add(buf);
                        visited.add(xord+","+yord);
                    }
                        
                }
            }
            steps++;
        }
        
        return steps;
        
        
    }
        
    
}