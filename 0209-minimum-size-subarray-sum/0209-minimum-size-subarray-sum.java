class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int max=Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(target<=sum)
            {
                sum-=nums[l];
                max=Math.min(max,r-l+1);
                l++;
            }
            r++;
        }
        if(max==Integer.MAX_VALUE)return 0;
        return max;
    }
}