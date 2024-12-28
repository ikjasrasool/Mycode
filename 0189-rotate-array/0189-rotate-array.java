class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k %= size;

        reverse(nums, 0, size - 1);  // Reverse the entire array
        reverse(nums, 0, k - 1);     // Reverse the first k elements
        reverse(nums, k, size - 1);  // Reverse the remaining elements
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}