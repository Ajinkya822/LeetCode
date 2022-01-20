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
    boolean ans= true;
    public boolean isBalanced(TreeNode root) {
     //same concept as depth
        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root==null ||ans==false) //when ans is false return 
            return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(Math.abs(left-right)>1){
            ans=false;
        }
        return 1+Math.max(left,right);
    }
}