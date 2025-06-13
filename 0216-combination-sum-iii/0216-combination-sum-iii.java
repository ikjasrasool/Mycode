class Solution {
    void backtrack(List<Integer>current,List<List<Integer>> result,int start,int k,int target)
    {
        if(target<0)
        {
            return;
        }
        if (current.size() > k) {
            return; 
        }
        
        if(target==0 && current.size()==k)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=9;i++)
        {
            current.add(i);
            backtrack(current,result,i+1,k,target-i);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        backtrack(current,result,1,k,n);
        return result;
    }
}