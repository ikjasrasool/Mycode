class Solution {
    void dfs( List<List<Integer>> result,int start,int[] nums)
    {
        if(start==nums.length)
        {
            List<Integer>t=new ArrayList<>();
            for(int x:nums)
            {
                t.add(x);
            }
            result.add(t);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            dfs( result, start + 1,nums);
            swap(nums, start, i); // backtrack
        }

    }
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,0,nums);
        return res;
    }
}