class Solution {
    public int videoStitching(int[][] clips, int time) {
        int min=0;
        int max=0;
        int op=0;
        
        while(max<time){
            
            for(int i=0;i<clips.length;i++){
                int left=clips[i][0];
                int right=clips[i][1];
                if(left<=min && right>max){
                    max=right;
                }
            }
            if(min==max)
                return -1;
            min=max;
            op++;
            
        }
        return op;
    }
}