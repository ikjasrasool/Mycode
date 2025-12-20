class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int ml=height[l];
        int mr=height[r];
        int t=0;
        while(l<r)
        {
            if(height[l]<=height[r])
            {
                if(height[l]>=ml)
                {
                    ml=height[l];
                }
                else
                {
                    t+=ml-height[l];
                }
                l++;
            }
            else
            {
                if(height[r]>=mr)
                {
                    mr=height[r];
                }
                else
                {
                    t+=mr-height[r];
                }
                r--;
            }
        }
        return t;
    }
}