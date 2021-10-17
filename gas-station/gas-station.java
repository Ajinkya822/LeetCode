class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        //for loop for start position
        
        int availableGas=0;
        int gasNeeded=0;
        int tempStart=0;
        int count=0;
        for(int start=0;start<gas.length;start++){
            availableGas=gas[start];
            gasNeeded=cost[start];
            tempStart=start;
            count=0;
            while(availableGas>=gasNeeded){
                count++;
                if(count==gas.length){
                    return start;
                }
                availableGas=availableGas-cost[tempStart];
                if(tempStart==gas.length-1)
                    tempStart=-1;
                tempStart++;
                availableGas=availableGas+gas[tempStart];
                gasNeeded=cost[tempStart];
            }
            
            
        }
        
        return -1;
    }
}