class Solution {
    public int removeElement(int[] nums, int val) {
        int valPtr=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                valPtr=i;
                break;
            }
        }
        int temp=0;
        for(int ptr=0;ptr<nums.length;ptr++){
            if(ptr>valPtr && nums[ptr]!=nums[valPtr]){
                temp=nums[ptr];
                nums[ptr]=nums[valPtr];
                nums[valPtr]=temp;
                //valPtr=ptr;
                valPtr++;
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ans++;
            }
            else{
                break;
            }
        }
        return ans;
    }
}