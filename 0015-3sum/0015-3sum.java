class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    r--;
                    l++;
                }
                else if(sum<0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return  new ArrayList<>(ans);
    }
}