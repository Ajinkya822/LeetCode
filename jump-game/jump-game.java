class Solution {
    public boolean canJump(int[] nums) {
        //int maxSoFar=nums[0];
        int available=nums[0];
        for(int i=1;i<nums.length;i++){
            if(available==0 && i<nums.length)
                return false;
            available=Math.max(available-1, nums[i]);
        }
        return true;
    }
}