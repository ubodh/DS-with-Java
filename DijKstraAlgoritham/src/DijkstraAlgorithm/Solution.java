package DijkstraAlgorithm;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            int w = s.nextInt();
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;
            int d = node.distance;

            if (d > dist[u]) {
                continue;
            }

            for (Edge e : graph.get(u)) {
                int v = e.to;
                int w = e.weight;
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(distance, other.distance);
        }
    }
}
