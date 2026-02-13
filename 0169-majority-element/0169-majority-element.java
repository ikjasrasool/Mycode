class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int n=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                n=nums[i];
            }
            c+=(n==nums[i])?1:-1;
        } 
        return n; 
    }
}