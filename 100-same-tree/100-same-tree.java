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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.val!=q.val)
            return false;
        return ((isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right)));
        */

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
            queue.add(temp2.left);
            queue.add(temp1.right);
            queue.add(temp2.right);
        }
        return true;
        
        
    }

}