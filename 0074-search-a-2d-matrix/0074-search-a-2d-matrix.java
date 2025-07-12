class Solution {
    boolean fun(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (fun(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }
}