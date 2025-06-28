class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges)
        {
            int a=edge[0];
            int b=edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis=new boolean[n+1];
        long c=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
               c+=dfs(n-2,adj,i,vis);
        }
        return c-1;
    }
    long dfs(int t,List<List<Integer>> adj,int node,boolean[] visited)
    {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(t-1,adj,neighbor,visited);
            }
        }
        return t;
    }
}