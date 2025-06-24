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
    public void dfs(TreeNode root,int t,List<Integer> cur,List<List<Integer>> res)
    {
        if(root==null) return;
        cur.add(root.val);
        t-=root.val;
        if(t==0&&root.left==null&&root.right==null)
        {
            res.add(new ArrayList<>(cur));
        }   
        else
        {
            dfs(root.left,t,cur,res);
            dfs(root.right,t,cur,res);
        } 
        cur.remove(cur.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> cur =new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        dfs(root,targetSum,cur,res);
        return res;
    }
}