class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int op[]=new int[2];
        int mid;
        int first=-1;
        int last =-1;
        int left=0;
        int right=nums.length-1;
        //find first position
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
        //find last positon
        left=0;
        right=nums.length-1;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        op[0]=first;
        op[1]=last;
        return op;
    }
}