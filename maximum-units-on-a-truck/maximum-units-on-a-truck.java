class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // fractional knapsack Greedy
        //sort by number of units. since we need to maximize the units
        
        Arrays.sort(boxTypes, (a, b)-> b[1]-a[1]);
        int max=0;
        int remainingCapacity=truckSize;
        
        for(int i=0;i<boxTypes.length || remainingCapacity==0;i++){
            if(boxTypes[i][0]<remainingCapacity){
                remainingCapacity-=boxTypes[i][0];
                max+=(boxTypes[i][1]*boxTypes[i][0]);
            }
            else{
                max+=(remainingCapacity*boxTypes[i][1]);
                break;
            }
        }
        return max;
        
    }
}