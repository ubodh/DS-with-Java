package primsAlgorithamAdjMat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimsAlgorithmAdjMat {
    public static int[] primsAlgorithm(int[][] adjMat) {
        int n = adjMat.length;
        int[] parent = new int[n]; // parent array to store MST
        int[] key = new int[n]; // key array to store minimum edge weights
        boolean[] visited = new boolean[n]; // visited array to mark visited vertices

        Arrays.fill(key, Integer.MAX_VALUE); // initialize key array with infinity
        key[0] = 0; // start from vertex 0

        for (int i = 0; i < n - 1; i++) {
            int u = getMinKeyVertex( visited,key); // get minimum key vertex that is not yet visited
            visited[u] = true; // mark vertex as visited

            // update key and parent arrays for all adjacent vertices of u
            for (int v = 0; v < n; v++) {
                if (adjMat[u][v] != 0 && !visited[v] && adjMat[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = adjMat[u][v];
                }
            }
        }

        return parent;
    }

    private static int getMinKeyVertex(boolean[] visited, int[] weight) {
		// TODO Auto-generated method stub
		int minIndex = -1;
        for (int i = 0; i < weight.length; i++) {
            if (!visited[i] && ( minIndex==-1 || weight[i]< weight[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
	}

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int e=sc.nextInt();
    	int adjMat[][]=new int[n][n];
    	for(int i=0;i<e;i++) {
    		int u=sc.nextInt();
    		int v=sc.nextInt();
    		int wt=sc.nextInt();
    		adjMat[u][v]=wt;
    		adjMat[v][u]=wt;
    	}
//        int[][] adjMat = {
//                {0, 2, 0, 6, 0},
//                {2, 0, 3, 8, 5},
//                {0, 3, 0, 0, 7},
//                {6, 8, 0, 0, 9},
//                {0, 5, 7, 9, 0}
//        };
        int[] parent = primsAlgorithm(adjMat);
        for (int i = 1; i < adjMat.length; i++) {
            System.out.println(parent[i] + " " + i + " " + adjMat[i][parent[i]]);
        }
    }
}
