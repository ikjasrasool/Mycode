class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        int n = graph.length;

        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(0, graph, res, temp);

        return res;
    }

    public void dfs(int tar, int[][] graph, List<List<Integer>> res, List<Integer> temp){

        if(tar == graph.length - 1){
            res.add(new ArrayList<>(temp));
            return;
        }// tar = target

        for(int neighbour : graph[tar]){
            temp.add(neighbour);
            dfs(neighbour, graph, res, temp);
            temp.remove(temp.size() - 1);  // Backtrack
        }
    }
}