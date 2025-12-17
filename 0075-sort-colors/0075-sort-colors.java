class Solution {
    public void sortColors(int[] nums) {
        int red=0,white=0,blue=nums.length-1;
        while(white<=blue)
        {
            if(nums[white]==0)
            {
                int t=nums[white];
                nums[white]=nums[red];
                nums[red]=t;
                red++;
                white++;
            }
            else if(nums[white]==1)
            {
                white++;
            }
            else
            {
                int t=nums[white];
                nums[white]=nums[blue];
                nums[blue]=t;
                blue--;
            }
        }
    }
}