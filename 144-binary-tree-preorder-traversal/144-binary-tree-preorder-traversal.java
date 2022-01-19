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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> op=new ArrayList<Integer>();
        Stack<TreeNode> stk=new Stack<TreeNode>();
        TreeNode current=root;
        
        while(current!=null || !stk.empty()){
            while(current!=null){
                stk.push(current);
                op.add(current.val);
                current=current.left;
            }
            current=stk.pop();
            current=current.right;
        }
        return op;
        
        // List<Integer> op=new ArrayList<>();
        //     if(root==null){
        //         return op;
        //     }
        // op.add(root.val);
        // op.addAll(preorderTraversal(root.left));
        // op.addAll(preorderTraversal(root.right));
        // return op;
    
    }
}