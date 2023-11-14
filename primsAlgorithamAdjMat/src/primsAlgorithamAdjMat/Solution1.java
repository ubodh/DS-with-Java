package primsAlgorithamAdjMat;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution1 {
    
    public static void prims(int[][] adjMat) {
        int n = adjMat.length;
        int[] parent = new int[n];
        int[] weight = new int[n];
        boolean[] visited = new boolean[n];
        
        // Initialize weight array with maximum value
        for(int i=0;i<n;i++) {
            weight[i]=Integer.MAX_VALUE;
        }
        
        // Use a priority queue to store vertices and their corresponding edge weights
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, 0)); // Start from vertex 0
        
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int vertex = curr.vertex;
            
            // Skip if vertex is already visited
            if(visited[vertex]) {
                continue;
            }
            
            visited[vertex] = true;
            weight[vertex] = curr.weight;
            
            // Update the edge weights of the neighbors
            for(int neighbor=0; neighbor<n; neighbor++) {
                if(adjMat[vertex][neighbor]!=0 && !visited[neighbor] && weight[neighbor]>adjMat[vertex][neighbor]) {
                    pq.offer(new Pair(neighbor, adjMat[vertex][neighbor]));
                    parent[neighbor] = vertex;
                }
            }
        }
        
        // Print the MST
        for(int i=1;i<n;i++) {
            if(i<parent[i]) {
                System.out.println(i+ " "+parent[i]+" "+weight[i]);
            } else {
                System.out.println(parent[i]+ " "+i+" "+weight[i]);
            }
        }
    }
    
    private static class Pair implements Comparable<Pair>{
        int vertex;
        int weight;
        
        public Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        
        public int compareTo(Pair other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int adjMat[][] = new int[n][n];
        for(int i=0; i<e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();
            adjMat[u][v] = wt;
            adjMat[v][u] = wt;
        }
        prims(adjMat);
        sc.close();
    }
}
