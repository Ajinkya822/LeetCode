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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> op=new ArrayList<>();
        helper(root, "",op);
        return op;
    }
    public void helper(TreeNode root, String path, List<String> op){
        if(root.left==null && root.right==null){
            op.add(path+root.val);
        }
        if(root.left!=null){
            helper(root.left, path+root.val+"->", op);
        }
        if(root.right!=null){
            helper(root.right, path+root.val+"->", op);
        }
    }
}