class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
         Arrays.sort(nums);
        backtrack(res,cur,nums,0);
        return res;
    }
    void backtrack(List<List<Integer>> res,List<Integer>cur,int[] nums,int start)
    {
        res.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++)
        {
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            cur.add(nums[i]);
            backtrack(res,cur,nums,i+1);
            cur.remove(cur.size()-1);
        }
    }
}