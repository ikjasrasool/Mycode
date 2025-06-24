class Solution {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        
        dfs(root, targetSum);                      // Start from current node
        pathSum(root.left, targetSum);             // Start from left subtree
        pathSum(root.right, targetSum);            // Start from right subtree
        
        return count;
    }

    public void dfs(TreeNode node, long target) {
        if (node == null) return;

        if (node.val == target) count++;

        dfs(node.left, target - node.val);         // Check left subtree with reduced target
        dfs(node.right, target - node.val);        // Check right subtree with reduced target
    }
}
