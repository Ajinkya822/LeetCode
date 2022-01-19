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
    public boolean isSymmetric(TreeNode root) {
        // //convert this problem into Same tree problem...
        if(!isMirror(root.left, root.right)){
            return false;
        }
        else 
            return true;
    }
    public boolean isMirror(TreeNode p, TreeNode q){
        // if(p==null && q==null)
        //     return true;
        // if(p==null || q==null)
        //     return false;
        // if(p.val!=q.val)
        //     return false;
        // //check parameteres important
        // return ((isMirror(p.left, q.right)) && (isMirror(p.right, q.left)));
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){
            TreeNode temp1=queue.poll();
            TreeNode temp2=queue.poll();
            //important step
            if(temp1==null && temp2==null){
                continue;
            }
            else if(temp1==null || temp2==null || temp1.val!=temp2.val ){
                return false;
            }
            queue.add(temp1.left);
            queue.add(temp2.right);
            queue.add(temp1.right);
            queue.add(temp2.left);
        }
        return true;
    }
}