package primsAlgorithamAdjMat;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int u;
    int v;
    int weight;

    Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return Integer.compare(weight, other.weight);
    }
}

public class Solution {
    public static void prims(int[][] adjMat) {
        int n = adjMat.length;
        boolean[] visited = new boolean[n];
        Edge[] edges = new Edge[n - 1];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>();

        // Add all edges connected to vertex 0 to the heap
        visited[0] = true;
        for (int j = 1; j < n; j++) {
            if (adjMat[0][j] != 0) {
                minHeap.offer(new Edge(0, j, adjMat[0][j]));
            }
        }

        // Process edges until all vertices have been visited
        int i = 0;
        while (i < n - 1 && !minHeap.isEmpty()) {
            Edge currEdge = minHeap.poll();

            // Skip edge if both vertices have already been visited
            if (visited[currEdge.u] && visited[currEdge.v]) {
                continue;
            }

            // Add edge to MST
            edges[i] = currEdge;
            i++;

            // Mark unvisited vertex as visited and add its edges to the heap
            int nextVertex = visited[currEdge.u] ? currEdge.v : currEdge.u;
            visited[nextVertex] = true;
            for (int j = 0; j < n; j++) {
                if (adjMat[nextVertex][j] != 0 && !visited[j]) {
                    minHeap.offer(new Edge(nextVertex, j, adjMat[nextVertex][j]));
                }
            }
        }

        // Print MST
        int totalWeight = 0;
        for (Edge e : edges) {
            System.out.println(e.u + " " + e.v + " " + e.weight);
            totalWeight += e.weight;
        }
//System.out.println("Total weight of MST: " + totalWeight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] adjMat = new int[n][n];
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();
            adjMat[u][v] = wt;
            adjMat[v][u] = wt;
        }
        prims(adjMat);
    }
}
