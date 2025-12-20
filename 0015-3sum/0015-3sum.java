class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                if(nums[i]+nums[r]+nums[l]==0)
                {
                    List<Integer> t=new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[r]);
                    t.add(nums[l]);
                    res.add(t);
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
                else if (nums[i]+nums[r]+nums[l] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}