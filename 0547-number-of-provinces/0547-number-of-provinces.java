import java.util.*;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        // Step 1: Create adjacency list for 1-based indexing
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) adjList.add(new ArrayList<>());

        // Adjusted loop to fill adjList using 1-based node numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    adjList.get(i + 1).add(j + 1); // node i -> i+1
                    adjList.get(j + 1).add(i + 1); // node j -> j+1
                }
            }
        }

        // Step 2: Apply DFS
        boolean[] visited = new boolean[n + 1]; // 1-based indexing
        int provinceCount = 0;

        for (int node = 1; node <= n; node++) {
            if (!visited[node]) {
                provinceCount++;
                dfs(node, adjList, visited);
            }
        }

        return provinceCount;
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
