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
    public List<Integer> inorderTraversal(TreeNode root) {
        
//         List<Integer> op=new ArrayList<Integer>();
//         Stack<TreeNode> stk=new Stack<TreeNode>();
//         TreeNode curr=root;
        
//         while(curr!=null || !stk.empty()){
//             while(curr!=null){
//                 stk.push(curr);
//                 curr=curr.left;
//             }
//             curr=stk.pop();
//             op.add(curr.val);
//             curr=curr.right;
//         }
//         return op;
        List<Integer> op=new ArrayList<Integer>();
        if(root==null){
            return op;
        }
        op.addAll(inorderTraversal(root.left));
        op.add(root.val);
        op.addAll(inorderTraversal(root.right));
        return op;
    }

    
}