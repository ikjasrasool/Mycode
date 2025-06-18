class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0)
                {
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else
                {
                    List<Integer>t=new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[j]);
                    t.add(nums[k]);
                    res.add(t);
                    while (j < k  && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }

            }
        }
        return res;
    }
}