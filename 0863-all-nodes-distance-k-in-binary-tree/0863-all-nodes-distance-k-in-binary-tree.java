/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
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
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        find(root, target, k);
        return ans;
    }

    private int find(TreeNode root, TreeNode target, int k) {
        if (root == null) return -1;
        if (root == target) {
            dfs(root, k);
            return 1;
        }
        int left = find(root.left, target, k);
        if (left > 0) {
            dfs(root.right, k - left - 1);
            if (left == k) ans.add(root.val);
            return left + 1;
        }
        int right = find(root.right, target, k);
        if (right > 0) {
            dfs(root.left, k - right - 1);
            if (right == k) ans.add(root.val);
            return right + 1;
        }
        return -1;
    }
    private void dfs(TreeNode root, int k) {
        if (root == null || k < 0) return;

        if (k == 0) {
            ans.add(root.val);
            return;
        }

        dfs(root.left, k - 1);
        dfs(root.right, k - 1);
    }
}
