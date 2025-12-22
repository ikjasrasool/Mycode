class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list , List<Integer> t, int [] nums, int start)
    {
        list.add(new ArrayList<>(t));
        for(int i=start;i<nums.length;i++)
        {
            t.add(nums[i]);
            backtrack(list, t, nums, i+1);
            t.remove(t.size()-1);
        }
    }

}