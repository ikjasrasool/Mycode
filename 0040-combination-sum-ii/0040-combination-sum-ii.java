class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(can);
        backtrack(res,can,target,0,new ArrayList<>());
        return res;
    }
     public void backtrack(List<List<Integer>> res,int[] can,int t,int s,List<Integer> te)
    {
        if(t<0)
        {
            return;
        }
        if(t==0)
        {
            res.add(new ArrayList<>(te));
            return;
        }
        for(int i=s;i<can.length;i++)
        {
            if (i > s && can[i] == can[i - 1]) continue;
            te.add(can[i]);
            backtrack(res,can,t-can[i],i+1,te);
            te.remove(te.size()-1);
        }
    }
}