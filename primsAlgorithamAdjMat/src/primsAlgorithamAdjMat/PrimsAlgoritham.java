package primsAlgorithamAdjMat;

import java.util.Scanner;
// code is correct 
public class PrimsAlgoritham {
	
	public static void prims(int[][] adjMat) {
		// TODO Auto-generated method stub
		int n = adjMat.length;
        int[] parent = new int[n]; // parent array to store MST
        int[] weight = new int[n]; // key array to store minimum edge weights
        boolean[] visited = new boolean[n]; // visited array to mark visited vertices
		
        // source -vertex 0
        parent[0]=-1;
        weight[0]=0;
        for(int i=1;i<n;i++) {
        	weight[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++) {
        	int minVertex=findMinVertex(visited,weight);
        	visited[minVertex]=true;
        	// Explore neighors of min vertx
        	for(int j=0;j<n;j++) {
        		if(adjMat[minVertex][j]!=0 && !visited[j]) {
        			if(weight[j]>adjMat[minVertex][j]) {
        				// update values
        				weight[j]=adjMat[minVertex][j];
        				parent[j]=minVertex;
        			}
        		}
        	}
        }
        //print MST
        for(int i=1;i<n;i++) {
        	if(i<parent[i])
        	System.out.println(i+ " "+parent[i]+" "+weight[i]);
        else {
        	System.out.println(parent[i]+ " "+i+" "+weight[i]);
        }
        }
	}

	private static int findMinVertex(boolean[] visited, int[] weight) {
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
		// TODO Auto-generated method stub
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
    	prims(adjMat);

	}

}
