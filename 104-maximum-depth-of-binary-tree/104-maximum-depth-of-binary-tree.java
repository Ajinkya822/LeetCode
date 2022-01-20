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
    public int maxDepth(TreeNode root) {
        // if(root==null)
        //     return 0;
        // return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
        
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        int depth=0;
        List<List<Integer>> op=new ArrayList<>();
        if(root==null){
            return depth;
        }
        TreeNode temp=root;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ls=new ArrayList<>();
            depth++;
            int count=q.size();
            for(int i=0;i<count;i++){
                
                temp=q.remove();
                ls.add(temp.val); 
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right); 
                
            }
            op.add(ls);
        }
       // return op;
        return depth;
    }
}