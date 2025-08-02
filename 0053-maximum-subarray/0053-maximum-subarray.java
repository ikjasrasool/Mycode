class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(nums[i],max+nums[i]);
            res=Math.max(res,max);
        }
        return res;
    }
}