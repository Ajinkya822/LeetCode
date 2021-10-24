class Solution {
    public int minTaps(int n, int[] ranges) {
        int op=0;
        int min=0;
        int max=0;
        int index=0;
        
        while(max<n){
            for(int i=index;i<ranges.length;i++){
                int left=i-ranges[i];
                int right=i+ranges[i];
                if(left<=min && right>max){
                    max=right;
                    index=i;
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