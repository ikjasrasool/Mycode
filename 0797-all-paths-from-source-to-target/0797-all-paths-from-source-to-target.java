import java.util.*;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        int targetNode = graph.length - 1;  // Declare target node once

        currentPath.add(0);
        dfs(graph, 0, targetNode, currentPath, allPaths);

        return allPaths;
    }

    private void dfs(int[][] graph, int currentNode, int targetNode, List<Integer> currentPath, List<List<Integer>> allPaths) {
        if (currentNode == targetNode) {
            allPaths.add(new ArrayList<>(currentPath));  // Store a copy of the path
            return;
        }

        for (int neighbor : graph[currentNode]) {
            currentPath.add(neighbor);
            dfs(graph, neighbor, targetNode, currentPath, allPaths);
            currentPath.remove(currentPath.size() - 1);  // Backtrack
        }
    }
}
