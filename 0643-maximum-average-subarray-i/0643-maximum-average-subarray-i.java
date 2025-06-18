class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        double winmax=0;
        for(int i=0;i<k;i++)
        {
            winmax+=nums[i];
        }
        max=winmax;
        for(int i=k;i<nums.length;i++)
        {
            winmax+=nums[i]-nums[i-k];
            max=Math.max(winmax,max);
        }
        return max/(float)k;
    }
}