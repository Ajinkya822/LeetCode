class Solution {
    public void sortColors(int[] nums) {
        int zeroptr=0;
        int oneptr=0;
        int twoptr=nums.length-1;
        
        while(oneptr<=twoptr){
            if(nums[oneptr]==0){
                swap(zeroptr,oneptr,nums);
                zeroptr++;
                oneptr++;
            }
            else if(nums[oneptr]==1){
                oneptr++;
            }
            else if(nums[oneptr]==2){
                swap(twoptr,oneptr,nums);
                twoptr--;
            }
        }
        
    }
    public void swap(int a, int b,int []nums){
        int temp=0;
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}