class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; 
        Arrays.sort(nums); 
        int small=Integer.MIN_VALUE;
        int c=0;
        int long1=1;
        for(int i=0;i<nums.length;i++)
        {
             if (nums[i] == small) {
                continue;
            }
            if(nums[i]-1==small)
            {
                c++;
                small=nums[i];
            }
            else
            {
                c=1;
                small=nums[i];
            }
            long1=Math.max(long1,c);
        }
        return long1;
    }
}