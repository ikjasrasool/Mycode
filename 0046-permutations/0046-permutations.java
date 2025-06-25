class Solution {
    void per(int[] nums,List<List<Integer>> res,List<Integer> cur)
    {
        if(cur.size()==nums.length)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(cur.contains(nums[i])) continue;
            cur.add(nums[i]);
            per(nums,res,cur);
            cur.remove(cur.size()-1);
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        per(nums,res,cur);
        return res;
    }
}