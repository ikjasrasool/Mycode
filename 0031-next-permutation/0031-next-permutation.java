class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        
        // Step 1: Find the first decreasing element from right
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        
        // Step 2: If found, swap it with the next bigger number on right
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        // Step 3: Reverse the subarray to the right of i
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) swap(nums, start++, end--);
    }
}
