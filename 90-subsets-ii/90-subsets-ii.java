class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> op=new ArrayList<>();
        List<Integer> templist=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, op, 0, templist);
        return op;
    }
    
    public void backtrack(int[] nums, List<List<Integer>> op, int start, List<Integer> templist){
        
        List<Integer> copy=new ArrayList<>(templist);
        op.add(copy);
        
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])
                continue;
            templist.add(nums[i]);
            backtrack(nums, op, i+1, templist);
            templist.remove(templist.size()-1);
        }
    }
}