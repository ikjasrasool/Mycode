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
    public int maxLevelSum(TreeNode root) {
        int count=0;
        List<List<Integer>> res = new ArrayList<>();
        int max=0;
        ArrayList<Integer> arrtemp = new ArrayList<>();
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
         while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> t=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode cur=q.poll();
                t.add(cur.val);
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);

            }
            int sum=0;
            for(int i=0;i<t.size();i++)
            {
                sum+=t.get(i);
            }
            arrtemp.add(sum);
            max=Math.max(max,sum);
            res.add(t);
            n = q.size();
         }
         int maxx=-999999999;
         int ind=0;
         for(int i=0;i<arrtemp.size();i++)
         {
            if(arrtemp.get(i)>maxx)
            {
                maxx=arrtemp.get(i);
                ind = i+1;
            }
         }

         return ind;
    }
}