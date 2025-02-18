class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(target-nums[i]))//check map contain key
            {
                return new int[]{m.get(target-nums[i]),i};
            }
            m.put(nums[i],i);// store key
        }
        return new int []{};

    }
}