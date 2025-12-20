class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length; 
        int i=n-2;
        while(i>=0&& nums[i]>=nums[i+1])i--;


        if(i>=0)
        {
            int j=n-1;
            while(nums[i]>=nums[j])j--;
            int t = nums[i]; 
            nums[i] = nums[j]; 
            nums[j] = t;
        }

        int start=i+1;
        int end=n-1;
        while (start < end) {
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }
}