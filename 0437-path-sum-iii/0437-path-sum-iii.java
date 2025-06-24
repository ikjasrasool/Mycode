import java.util.*;

class Solution {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0L, 1L); // Base case: empty path has sum 0
        dfs(root, 0, targetSum, prefixSumMap);
        return count;
    }

    private void dfs(TreeNode node, long currSum, int targetSum, Map<Long, Integer> map) {
        if (node == null) return;

        currSum += node.val;

        // Check if there is a prefix sum that matches the requirement
        if (map.containsKey(currSum - targetSum)) {
            count += map.get(currSum - targetSum);
        }

        // Update the current prefix sum
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        // Recurse into left and right subtrees
        dfs(node.left, currSum, targetSum, map);
        dfs(node.right, currSum, targetSum, map);

        // Backtrack to remove current path
        map.put(currSum, map.get(currSum) - 1);
    }
}
