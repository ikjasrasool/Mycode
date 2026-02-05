class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int n = nums.length;
        int[] res = new int[n];
        int i=nums.length-1;
        while(l<=r)
        {
            int lsum=nums[l]*nums[l];
            int rsum=nums[r]*nums[r];
            if(lsum<rsum)
            {
                res[i]=rsum;
                r--;
            }
            else
            {
                res[i]=lsum;
                l++;
            }
            i--;
        }
        return res;
    }
}