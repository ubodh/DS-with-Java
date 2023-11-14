package primsAlgorithamAdjMat;
import java.util.*;

public class Solution3 {

    public static void primsMST(int[][] graph) {
        int V = graph.length;
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] key = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        PriorityQueue<Node> pq = new PriorityQueue<Node>(V, new Node());

        key[0] = 0;
        parent[0] = -1;
        pq.add(new Node(0, key[0]));

        while (!pq.isEmpty()) {
            int u = pq.remove().vertex;
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                    pq.add(new Node(v, key[v]));
                }
            }
        }

        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " " + i + " " + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] graph = new int[V][V];

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph[u][v] = w;
            graph[v][u] = w;
        }

        primsMST(graph);
    }

}

class Node implements Comparator<Node> {
    int vertex;
    int weight;

    public Node() {}

    public Node(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public int compare(Node node1, Node node2) {
        return node1.weight - node2.weight;
    }
}



