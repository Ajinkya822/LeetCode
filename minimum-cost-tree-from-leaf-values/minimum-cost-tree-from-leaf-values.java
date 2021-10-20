class Solution {
    public int mctFromLeafValues(int[] arr) {
//Greedy solution:
//To achieve a better time complexity, one important observation is that when we build each level of the binary tree, it is the max left leaf node and max right lead node that are being used, so we would like to put big leaf nodes close to the root. Otherwise, taking the leaf node with max value in the array as an example, if its level is deep, for each level above it, its value will be used to calculate the non-leaf node value, which will result in a big total sum.
//With above observation, the greedy approach is to find the smallest value in the array, use it and its smaller neighbor to build a non-leaf node, then we can safely delete it from the array since it has a smaller value than its neightbor so it will never be used again. Repeat this process until there is only one node left in the array (which means we cannot build a new level any more)
//you cannot sort the input
        int result=0;
        List<Integer> input=new ArrayList<>(); 
        int index;
        
        for(int num:arr)
            input.add(num);
        
        
        while(input.size()!=1){
            index=input.indexOf(Collections.min(input));
            
            if(index>0 && index<input.size()-1){
                result+=input.get(index)*(Math.min(input.get(index-1),input.get(index+1)));    
            }
            else if(index==0){
                result+=input.get(index)*input.get(index+1);
            }
            else if(index==input.size()-1){
                result+=input.get(index)*input.get(index-1);
            }
            input.remove(index);
        }
        
        return result;
    }
}