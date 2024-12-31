class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target)
                {
                    return sum;
                }
                else if(sum<target)
                {
                    l++;
                }
                else
                {
                    r--;
                }
                if(Math.abs(target-sum)<Math.abs(target-closest_sum)){
                    closest_sum = sum;
                }
            }
        }
        return closest_sum;
    }
}