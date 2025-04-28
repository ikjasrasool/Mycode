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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        pre(al,0,root);
        return al;
    }
    public static void pre(List<List<Integer>> al,int l,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(al.size()==l)
        {
             List<Integer>li=new ArrayList<>();
             li.add(root.val);
             al.add(li);
        }
        else
        {
            al.get(l).add(root.val);
        }
        pre(al,l+1,root.left);
        pre(al,l+1,root.right);
    }
}