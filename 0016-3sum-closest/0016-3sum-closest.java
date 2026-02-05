class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closet=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[r]+nums[l];
                if(sum==target)
                {
                    return sum;
                }
                else if(sum>target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
                if (Math.abs(sum - target) < Math.abs(closet - target)) {
                     closet = sum;
                }

            }
        }
        return closet;
    }
}