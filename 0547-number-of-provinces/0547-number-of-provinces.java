class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> res=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            res.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isConnected[i][j]==1)
                {
                    res.get(i).add(j);
                    res.get(j).add(i);
                }
            }
        }

        boolean[] vis=new boolean[n+1];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                c++;
                dfs(i,res,vis);
            }
        }
        return c;
    }
    private void dfs(int node, List<List<Integer>> adjList, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited);
            }
        }
    }
}