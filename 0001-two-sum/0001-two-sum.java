class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(res.containsKey(nums[i]))
            {
                return new int[]{i,res.get(nums[i])};
            }
            res.put(target-nums[i],i);
        }
        return new int[]{};
    }
}