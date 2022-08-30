class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int op []=new int [nums.length];
//         int mult=1;
//         for(int i=0;i<nums.length;i++){
//             mult=mult*nums[i];
//             op[i]=mult;
//         }
       
//         int right=1;
//         for(int i=nums.length-1;i>=0;i--){
//             if(i==nums.length-1){
//                 op[i]=op[i-1]*right;
//                 right=nums[i];
//             }
//             else if(i==0){
//                 op[i]=right*1;
//             }
//             else{
//                 op[i]=op[i-1]*right;
//                 right=right*nums[i];
//             }
            
//         }
//         return op;
        
        int[] leftArray=new int[nums.length];
        int[] rightArray=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
          leftArray[i]=1;
          rightArray[i]=1;
        }
        for(int i=1;i<nums.length;i++) {
          leftArray[i]=leftArray[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--) {
          rightArray[i]=rightArray[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++) {
          nums[i]=leftArray[i]*rightArray[i];
        }
        return nums;
    }
}