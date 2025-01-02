class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }

        int c=1;
        int max1=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]==nums[i-1]+1)
                {
                    c++;
                }
                else
                {
                    max1=Math.max(max1,c);
                    c=1;
                }
            }

        }
        return Math.max(max1,c);
    }
}