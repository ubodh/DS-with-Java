package DijkstraAlgorithm;

import java.util.*;

public class DijkstraAlgorithm {

    static class Node implements Comparable<Node> {
        int v, dist;
        Node(int v, int dist) {
            this.v = v;
            this.dist = dist;
        }
        public int compareTo(Node other) {
            return Integer.compare(dist, other.dist);
        }
    }

    static void dijkstra(List<List<Node>> adj, int src, int[] dist) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(src, 0));
        dist[src] = 0;
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.v;
            for (Node neighbor : adj.get(u)) {
                int v = neighbor.v;
                int weight = neighbor.dist;
                int newDist = dist[u] + weight;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(new Node(v, newDist));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        List<List<Node>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            int weight = s.nextInt();
            adj.get(u).add(new Node(v, weight));
            adj.get(v).add(new Node(u, weight));
        }
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dijkstra(adj, 0, dist);
        for (int i = 0; i < V; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }
}
