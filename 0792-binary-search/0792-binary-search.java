class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int n=nums.length;
        int r=n-1;
        
        while(l<=r)
        {
            int mid=l+((r-l)/2);
            if(nums[mid]==target)
            {
                return mid;
            }
            if(target<nums[mid])
            {
                r=mid-1;
            }
            else 
            {
                l=mid+1;
            }

        }
        return -1;
    }
}