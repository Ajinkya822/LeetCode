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
    int target=7;
    List<TreeNode> op1=new LinkedList<>();
    List<TreeNode> op2=new LinkedList<>();
    boolean isFoundp=false;
    boolean isFoundq=false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //find path using dfs
            findpathp(root,p);
            findpathq(root,q);
            //System.out.print(op1);
            //System.out.print(op2);
            int i=0;
            while(true){
                if(i<op1.size() && i<op2.size() && op1.get(i).val==op2.get(i).val){
                    i++;
                }
                else{
                    return op1.get(i-1);
                }
            }
            //return root;
        }
    public List<TreeNode> findpathp(TreeNode root, TreeNode p){
            if(root==null)
                return null;
            if(p.val==root.val){
                isFoundp=true;
                op1.add(root);
                return op1;
            }
            op1.add(root);
            
            if(!isFoundp){
                findpathp(root.left,p); 
            }
                
            if(!isFoundp){
                findpathp(root.right,p);
            }
            if(!isFoundp){
                op1.remove(op1.size()-1);
            }

            return op1;
    }
    
    public List<TreeNode> findpathq(TreeNode root, TreeNode q){
            if(root==null)
                return null;
            if(q.val==root.val){
                isFoundq=true;
                op2.add(root);
                return op2;
            }
            op2.add(root);
            
            if(!isFoundq){
               findpathq(root.left,q); 
            }
                
            if(!isFoundq){
                findpathq(root.right,q);
            }
            if(!isFoundq){
                op2.remove(op2.size()-1);
            }

            return op2;
    }
}