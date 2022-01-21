/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root==p || root==q || root==null){
//             return root;
//         }
        
//         TreeNode left=lowestCommonAncestor(root.left, p, q);
//         TreeNode right=lowestCommonAncestor(root.right, p, q);
        
//         if(left!=null && right!=null){
//             return root;
//         }
//         return left==null?right:left;
        
        if(p.val==root.val || q.val==root.val){
            return root;
        }
        if((p.val>root.val && q.val<root.val) || ((q.val>root.val && p.val<root.val)) ){
            return root;
        }
        else if(p.val>root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else{
            return lowestCommonAncestor(root.left, p, q);
        }
        //return root;
    }
}