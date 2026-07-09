// Last updated: 08/07/2026, 21:40:18
class Solution {
    public int minCost(int n, int[][] edges) {

        List<int[]>[] adj = new ArrayList[n];
        List<int[]>[] rev = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            rev[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];

            adj[u].add(new int[]{v, w});
            rev[v].add(new int[]{u, w});
        }
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        dist[0] = 0;
        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {

            long[] cur = pq.poll();
            long cost = cur[0];
            int node = (int) cur[1];

            if (cost > dist[node]) continue;

            if (node == n - 1)
                return (int) cost;

            // normal edges
            for (int[] next : adj[node]) {
                int v = next[0];
                int w = next[1];

                if (dist[v] > cost + w) {
                    dist[v] = cost + w;
                    pq.offer(new long[]{dist[v], v});
                }
            }

            // reversed incoming edges
            for (int[] prev : rev[node]) {
                int v = prev[0];
                int w = prev[1];

                if (dist[v] > cost + 2L * w) {
                    dist[v] = cost + 2L * w;
                    pq.offer(new long[]{dist[v], v});
                }
            }
        }

        return -1;
    }
}