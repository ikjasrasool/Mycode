class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close_sum=nums[0]+nums[1]+nums[2];
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
                if(sum>close_sum)
                {
                    close_sum=sum;
                }
            }
        }
        return close_sum;
    }
}