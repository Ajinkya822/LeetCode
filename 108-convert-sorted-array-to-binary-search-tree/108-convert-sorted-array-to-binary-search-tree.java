/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        //height balanced is an important term..
        //else we would have created skewed tree
        int left=0;
        int right=nums.length-1;
        return helperBs(left, right, nums);
        
    }
    public TreeNode helperBs(int left, int right, int []nums){
        if(right<left){
            return null;
        }
        int mid=(left+right)/2;
        
        TreeNode root=new TreeNode();
        root.val=nums[mid];
        root.left=helperBs(left, mid-1, nums);
        root.right=helperBs(mid+1, right, nums);
        return root;
    }
}