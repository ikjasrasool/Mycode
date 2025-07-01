class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] vis = new boolean[n];  // FIXED: was n+1
        long totalPairs = (long) n * (n - 1) / 2;
        long reachablePairs = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                long componentSize = dfs(0, adj, i, vis);  // Start with t = 0, to count size
                reachablePairs += componentSize * (componentSize - 1) / 2;
            }
        }

        return totalPairs - reachablePairs;
    }

    long dfs(long t, List<List<Integer>> adj, int node, boolean[] visited) {
        visited[node] = true;
        t++;  // Count the current node
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                t = dfs(t, adj, neighbor, visited);  // Accumulate count in t
            }
        }
        return t;
    }
}
