class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                num=nums[i];
            }
            c+=(num==nums[i])?1:-1;
        }
        return num;
    }
}