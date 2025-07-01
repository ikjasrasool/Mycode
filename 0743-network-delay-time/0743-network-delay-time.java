class Solution {
    static class Pair {
        int node, dist;
        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] time : times) {
            int u = time[0], v = time[1], w = time[2];
            graph.get(u).add(new Pair(v, w));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        // Step 3: Use PriorityQueue to perform Dijkstra
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.node;
            int d = current.dist;


            for (Pair neighbor : graph.get(u)) {
                int v = neighbor.node;
                int newDist = dist[u] + neighbor.dist;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.add(new Pair(v, newDist));
                }
            }
        }

        // Step 4: Find the maximum time needed
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, dist[i]);
        }

        return maxTime;
    }
}
