// Last updated: 08/07/2026, 21:40:21
import java.util.*;

class Solution {

    class Pair {
        int node;
        long cost;

        Pair(int node, long cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {

        int n = online.length;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        int maxEdge = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            graph[u].add(new int[]{v, w});
            maxEdge = Math.max(maxEdge, w);
        }

        int low = 0;
        int high = maxEdge;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canReach(graph, online, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canReach(List<int[]>[] graph, boolean[] online, long k, int limit) {

        int n = graph.length;

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));

        dist[0] = 0;
        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {

            Pair cur = pq.poll();

            if (cur.cost != dist[cur.node]) {
                continue;
            }

            if (cur.node == n - 1) {
                return cur.cost <= k;
            }

            for (int[] nextEdge : graph[cur.node]) {

                int next = nextEdge[0];
                int weight = nextEdge[1];

                // Edge score must be at least limit
                if (weight < limit) {
                    continue;
                }

                // Intermediate nodes must be online
                if (next != n - 1 && !online[next]) {
                    continue;
                }

                long newCost = cur.cost + weight;

                if (newCost < dist[next] && newCost <= k) {
                    dist[next] = newCost;
                    pq.offer(new Pair(next, newCost));
                }
            }
        }

        return false;
    }
}