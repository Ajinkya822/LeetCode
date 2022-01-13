class Solution {
    public int maxProduct(int[] nums) {
        int globalMax=nums[0];
        int maxEndingHere=nums[0];
        int minEndingHere=nums[0];
        int temp=0;       
        for(int i=1;i<nums.length;i++){
            temp=maxEndingHere;//since maxEndingHere will be modified in the next statement
            maxEndingHere=Math.max(Math.max(nums[i],nums[i]*maxEndingHere),nums[i]*minEndingHere);
            minEndingHere=Math.min(Math.min(nums[i],nums[i]*temp),nums[i]*minEndingHere);
            globalMax=Math.max(globalMax,maxEndingHere);
        }
        return globalMax;
    }
}