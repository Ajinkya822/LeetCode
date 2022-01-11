class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        
        //convert all values into positive values and in range 1 to n+1
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=n+1;
            }
        }
        //use index as a key
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])<=n){
                if(Math.abs(nums[i])!=0){
                    nums[Math.abs(nums[i])-1]=(-1)*Math.abs(nums[Math.abs(nums[i])-1]);     
                }
                   
            }
            
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=0)
                return i+1;
        }
        return n+1;
    }
}