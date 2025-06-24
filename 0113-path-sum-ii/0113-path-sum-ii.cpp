/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void traverseSum(TreeNode* node, int targetSum, vector<int>& path, vector<vector<int>>& result){
        if(!node) return;

        path.push_back(node->val);
        targetSum -= (node->val);

        if(!node->left && !node->right && targetSum == 0) result.push_back(path);

        traverseSum(node->left, targetSum, path, result);
        traverseSum(node->right, targetSum, path, result);

        path.pop_back();
    }

    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> result;
        vector<int> path;
        traverseSum(root, targetSum, path, result);
        return result;
    }
};