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
import java.util.*;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int maxWidth = 0;
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 0)); // node with index

        while (!q.isEmpty()) {
            int size = q.size();
            int min = q.peek().getValue(); // get index of first node
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> p = q.poll();
                TreeNode node = p.getKey();
                int idx = p.getValue() ; // prevent overflow by offsetting

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                if (node.left != null)
                    q.offer(new Pair<>(node.left, 2 * idx));
                if (node.right != null)
                    q.offer(new Pair<>(node.right, 2 * idx + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    // Helper Pair class (JavaFX-style or define your own if needed)
    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }
    }
}
