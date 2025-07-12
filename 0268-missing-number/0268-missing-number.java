class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        for(int i=1;i<=nums.length;i++)
        {
            xor=xor^i;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }
        return xor^ans;
    }
}