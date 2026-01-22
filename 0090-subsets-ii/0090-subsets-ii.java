class Solution {
    void backtrack(List<List<Integer>>res,List<Integer> t,int s,int[] nums)
    {
        res.add(new ArrayList<>(t));
        for(int i=s;i<nums.length;i++)
        {
            if (i > s && nums[i] == nums[i - 1]) continue;
            t.add(nums[i]);
            backtrack(res,t,i+1,nums);
            t.remove(t.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),0,nums);
        return res;
    }
}