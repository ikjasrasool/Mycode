class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> re=new ArrayList<>();
        re.add(new ArrayList<>());
        for(int x:nums){
            int size=re.size();
            for(int i=0;i<size;i++)
            {
                List<Integer> subset = new ArrayList<>(re.get(i));
                subset.add(x);
                re.add(subset);
            }
        }
        return re;
    }
}