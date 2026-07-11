// Last updated: 10/07/2026, 21:03:55
1class Solution {
2    public int countCompleteComponents(int n, int[][] edges) {
3
4        ArrayList<Integer>[] graph = new ArrayList[n];
5        for (int i = 0; i < n; i++) {
6            graph[i] = new ArrayList<>();
7        }
8
9        for (int[] e : edges) {
10            graph[e[0]].add(e[1]);
11            graph[e[1]].add(e[0]);
12        }
13
14        boolean[] visited = new boolean[n];
15        int count = 0;
16
17        for (int i = 0; i < n; i++) {
18            if (!visited[i]) {
19
20                ArrayList<Integer> component = new ArrayList<>();
21                dfs(i, graph, visited, component);
22
23                int vertices = component.size();
24                int degreeSum = 0;
25
26                for (int node : component) {
27                    degreeSum += graph[node].size();
28                }
29
30                int edgeCount = degreeSum / 2;
31
32                if (edgeCount == vertices * (vertices - 1) / 2) {
33                    count++;
34                }
35            }
36        }
37
38        return count;
39    }
40
41    public void dfs(int node, ArrayList<Integer>[] graph,
42                    boolean[] visited, ArrayList<Integer> component) {
43
44        visited[node] = true;
45        component.add(node);
46
47        for (int next : graph[node]) {
48            if (!visited[next]) {
49                dfs(next, graph, visited, component);
50            }
51        }
52    }
53}