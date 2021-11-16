class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
       // int op[][]=new int[intervals.length][2];
        List<int[]> op1=new ArrayList<int[]>();
     //   op[0][0]=intervals[0][0];
    //    op[0][1]=intervals[0][1];
        int index=0;
        op1.add(new int[] {intervals[0][0], intervals[0][1] });
        
        for(int i=1;i<intervals.length;i++){
            //add new entry/intervals into output
            if(intervals[i][0]>op1.get(index)[1]){ //   op[index][1]){
                index++;
            //    op[index][0]=intervals[i][0];
            //    op[index][1]=intervals[i][1];
                op1.add(new int[] {intervals[i][0],intervals[i][1] });
            }
            else{
                if(/*op[index][1]*/ op1.get(index)[1]<intervals[i][1]){
                    /*op[index][1]*/ op1.get(index)[1]=intervals[i][1];
                }
            }
        }
        int op[][]=new int[op1.size()][2];
        int i=0;
        for(int j=0;j<op1.size();j++){
            op[j][0]=op1.get(j)[0];
            op[j][1]=op1.get(j)[1];
            //i++;
        }
        
        return op;
    }
}