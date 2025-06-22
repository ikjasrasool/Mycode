class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;

        while(current != null || !st.isEmpty()) {
            if(current != null) {
                res.add(current.val);      // Add before going left → Preorder: root first
                st.push(current);
                current = current.left;
            } else {
                current = st.pop();
                current = current.right;
            }
        }

        return res;
    }
}
