package primsAlgorithamAdjMat;
import java.util.*;

public class PrimsMST {
	
    static class Edge {
        int src, dest, weight;
        
        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    
    static class Graph {
        int V;
        LinkedList<Edge>[] adjList;
        Graph(int V) {
            this.V = V;
            adjList = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjList[i] = new LinkedList<>();
            }
        }
        void addEdge(int src, int dest, int weight) {
            Edge edge = new Edge(src, dest, weight);
            adjList[src].add(edge);
            adjList[dest].add(edge);
        }
        void primMST() {
            boolean[] inMST = new boolean[V];
            int[] parent = new int[V];
            int[] key = new int[V];
            for (int i = 0; i < V; i++) {
                key[i] = Integer.MAX_VALUE;
            }
            key[0] = 0;
            parent[0] = -1;
            for (int i = 0; i < V - 1; i++) {
                int u = minKey(key, inMST);
                inMST[u] = true;
                for (Edge edge : adjList[u]) {
                    int v = (edge.src == u) ? edge.dest : edge.src;
                    if (!inMST[v] && key[v] > edge.weight) {
                        key[v] = edge.weight;
                        parent[v] = u;
                    }
                }
            }
            printMST(parent);
        }
        int minKey(int[] key, boolean[] inMST) {
            int min = Integer.MAX_VALUE, minIndex = -1;
            for (int i = 0; i < V; i++) {
                if (!inMST[i] && key[i] < min) {
                    min = key[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }
        void printMST(int[] parent) {
            for (int i = 1; i < V; i++) {
                System.out.println(Math.min(i, parent[i]) + " " + Math.max(i, parent[i]) + " " + key[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        Graph graph = new Graph(V);
        for (int i = 0; i < E; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            graph.addEdge(src, dest, weight);
        }
        graph.primMST();
        sc.close();
    }
}
