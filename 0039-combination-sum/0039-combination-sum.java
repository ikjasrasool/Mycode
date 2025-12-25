class Solution {
    void backtrack(List<Integer>current,List<List<Integer>> result,int start,int candidate[],int target)
    {
        if(target<0)
        {
            return;
        }
        if(target==0)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<candidate.length;i++)
        {
            current.add(candidate[i]);
            backtrack(current,result,i,candidate,target-candidate[i]);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        backtrack(current,result,0,candidates,target);
        return result;
    }
}