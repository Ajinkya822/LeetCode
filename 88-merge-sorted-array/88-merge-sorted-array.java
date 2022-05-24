class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Ptr=m-1;
        int nums2Ptr=n-1;
        int index=nums1.length-1;
        while(index>=0){
            if(nums1Ptr<0){
                nums1[index]=nums2[nums2Ptr];
                nums2Ptr--;
            }
            else if(nums2Ptr<0){
                nums1[index]=nums1[nums1Ptr];
                nums1Ptr--;
            }
            else{
                if(nums1[nums1Ptr]>=nums2[nums2Ptr]){
                    nums1[index]=nums1[nums1Ptr];
                    nums1Ptr--;
            }
                else{
                    nums1[index]=nums2[nums2Ptr];
                    nums2Ptr--;
                }
            }
            
            index--;
        }
    }
}