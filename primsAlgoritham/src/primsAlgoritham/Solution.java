package primsAlgoritham;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

class Edge {
    int u;
    int v;
    int weight;

    Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}

public class Solution {
    public static Edge[] PrimsAlgorithm(Edge[] edges) {
        if (edges == null || edges.length == 0) {
            return new Edge[0];
        }

        // Initialize variables
        int n = edges.length;
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<Edge> minHeap = new PriorityQueue<>(n, (e1, e2) -> e1.weight - e2.weight);

        // Add first edge to the heap and mark its vertices as visited
        minHeap.offer(edges[0]);
        visited.add(edges[0].u);
        visited.add(edges[0].v);

        // Process edges until all vertices have been visited
        List<Edge> mst = new ArrayList<>();
        while (visited.size() < n) {
            Edge currEdge = minHeap.poll();

            // Skip edge if both vertices have already been visited
            if (visited.contains(currEdge.u) && visited.contains(currEdge.v)) {
                continue;
            }

            // Add edge to MST and mark its unvisited vertex as visited
            mst.add(currEdge);
            int nextVertex = visited.contains(currEdge.u) ? currEdge.v : currEdge.u;
            visited.add(nextVertex);

            // Add all edges connected to the newly visited vertex to the heap
            for (Edge e : edges) {
                if (e != null && ((e.u == nextVertex && !visited.contains(e.v))
                        || (e.v == nextVertex && !visited.contains(e.u)))) {
                    minHeap.offer(e);
                }
            }
        }

        // Convert MST to array and return
        return mst.toArray(new Edge[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int adjMat[][] = new int[V][V];
        Edge edges[] = new Edge[E];
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();
            Edge ob = new Edge(u, v, wt);
            edges[i] = ob;
        }

        Edge[] ans = PrimsAlgorithm(edges);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i].u + " " + ans[i].v + " " + ans[i].weight);
        }
    }
}
