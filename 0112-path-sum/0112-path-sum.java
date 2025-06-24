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
    public boolean dfs(TreeNode root,int t,List<Integer> cur)
    {
        if(root==null) return false;
        cur.add(root.val);
        t-=root.val;
        if(t==0&&root.left==null&&root.right==null)
        {
            return true;
        }   
        boolean l=dfs(root.left,t,cur);
        boolean r=dfs(root.right,t,cur);
        cur.remove(cur.size()-1);
        return l||r;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> cur =new ArrayList<>();
        return dfs(root,targetSum,cur);
    }
}