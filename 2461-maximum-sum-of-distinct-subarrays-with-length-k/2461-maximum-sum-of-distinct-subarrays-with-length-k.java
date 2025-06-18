class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long winsum = 0;
        long max =0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            while(set.contains(nums[r]))
            {
                set.remove(nums[l]);
                winsum-=nums[l];
                l++;
            }
            set.add(nums[r]);
            winsum+=nums[r];
            if (r - l + 1 == k) {
                max = Math.max(max, winsum);
                set.remove(nums[l]);
                winsum -= nums[l];
                l++;
            }
        }
        return max;
    }
}
