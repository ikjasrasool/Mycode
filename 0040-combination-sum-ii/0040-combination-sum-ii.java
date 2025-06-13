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
            if (i > start && candidate[i] == candidate[i-1]) {
                continue;
            }
            if (candidate[i] > target) {
                break;
            }
            current.add(candidate[i]);
            backtrack(current,result,i+1,candidate,target-candidate[i]);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(current,result,0,candidates,target);
        return result;
    }
}