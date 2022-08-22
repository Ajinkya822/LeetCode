class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> op=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i-1]!=nums[i])
                twoSum(nums,i,op);
        }
        return op;
    }
    
    public void twoSum(int [] nums, int index,List<List<Integer>> op){
        int target=-1*nums[index];
        HashSet<Integer> map=new HashSet<>();
        for(int i=index+1;i<nums.length;i++){
            int compliment=target-nums[i];
            List<Integer> temp=new ArrayList<>();
            if(map.contains(compliment)){
                temp.add(nums[index]);
                temp.add(nums[i]);
                temp.add(compliment);
                op.add(temp); 
                while(i<nums.length-1 && nums[i]==nums[i+1])
                    i++;
            }
            else{
                map.add(nums[i]);
            }
        }
            
    }
    
}
    
