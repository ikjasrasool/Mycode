class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        int pos=-1;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            if(nums[i]>target)
            {
                pos=i;
                break;
            }
        }
        return pos==-1?nums.length:pos;
    }
}