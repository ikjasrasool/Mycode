class Solution {
    void backtrack(int[] can,int tar,List<Integer> com,List<List<Integer>> cur,int start)
    {
        if(tar==0)
        {
            cur.add(new ArrayList<>(com));
            return;
        }
        if(tar<0)
        {
            return;
        }
        for(int i=start;i<can.length;i++)
        {
            com.add(can[i]);
            backtrack(can,tar-can[i],com,cur,i);
            com.remove(com.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> cur=new ArrayList<>();
        List<Integer> com=new ArrayList<>();
        backtrack(candidates,target,com,cur,0);
        return cur;
    }
}