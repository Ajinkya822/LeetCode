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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //recursive
        // if(root==null)
        //     return false;
        // targetSum= targetSum-root.val;
        // //leaf node
        // if(root.left==null && root.right==null){
        //     if(targetSum==0){
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return hasPathSum(root.left, targetSum)||hasPathSum(root.right, targetSum);
        //iterative dfs
        Stack<TreeNode> path=new Stack<>();
        Stack<Integer> sum=new Stack<>();
        if(root==null)
            return false;
        path.push(root);
        sum.push(root.val);
        
        while(!path.isEmpty()){
            TreeNode temp=path.pop();
            int tempSum=sum.pop();
            if(temp.left==null && temp.right==null){
                if(tempSum==targetSum){
                    return true;
                }
            }
            if(temp.left!=null){
                path.push(temp.left);
                sum.push(tempSum+temp.left.val);
            }
            if(temp.right!=null){
                path.push(temp.right);
                sum.push(tempSum+temp.right.val);
            }
        }
        return false;
    }
}