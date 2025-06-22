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
        
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }

        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){

            TreeNode t=s.pop();
            if(t!=null){
            result.add(t.val);
            s.add(t.right);
            s.add(t.left);
            }
        }

        return result;
    }
}