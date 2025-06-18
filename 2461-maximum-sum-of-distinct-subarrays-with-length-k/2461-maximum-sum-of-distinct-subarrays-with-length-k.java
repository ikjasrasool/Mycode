import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0;
        int r = 0;
        Set<Integer> set = new HashSet<>();
        long max = 0;
        long wn = 0;

        while (r < nums.length) {
            // Remove from left until nums[r] is not a duplicate
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                wn -= nums[l];
                l++;
            }

            set.add(nums[r]);
            wn += nums[r];

            if (r - l + 1 == k) {
                max = Math.max(max, wn);

                // Slide the window by removing the leftmost element
                set.remove(nums[l]);
                wn -= nums[l];
                l++;
            }

            r++;
        }

        return max;
    }
}
