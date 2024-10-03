class Solution {
    public int trap(int[] height) {
        int right,left,lmax,rmax,water=0;
        left=0;
        right=height.length-1;
        rmax=height[right];
        lmax=height[left];
        while(left<right)
        {
            if(lmax<rmax)
            {
                left++;
                lmax=Math.max(lmax,height[left]);
                water=water+lmax-height[left];
            }
            else
            {
                right--;
                rmax=Math.max(rmax,height[right]);
                water=water+rmax-height[right];

            }
        }
        return water;
        
    }
}