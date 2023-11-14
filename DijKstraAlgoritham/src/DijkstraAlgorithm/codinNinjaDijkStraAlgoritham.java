package DijkstraAlgorithm;

import java.util.Scanner;


public class codinNinjaDijkStraAlgoritham {
	
	private static void DijkStraAlgoritham(int[][] adjMat) {
		// TODO Auto-generated method stub
		int n=adjMat.length;
		
		boolean visited[]=new boolean[n];
		int distance[]=new int[n];
		distance[0]=0;
		for(int i=1;i<n;i++) {
			distance[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<n-1;i++) {
			int minVertex=findMinVertex(visited,distance);
			visited[minVertex]=true;
			for(int j=0;j<n;j++) {
				if(adjMat[minVertex][j]> 0 &&!visited[j] && adjMat[minVertex][j]!=Integer.MAX_VALUE) {
					// j is Unvisted neighbor of minVertex
					// calculate distance to rech j from source via minVertex
					int newDist=distance[minVertex]+adjMat[minVertex][j];
					if(newDist<distance[j])
					distance[j]=newDist;
				}
						
			}
		}
		// print Distance values for all vertices
		for(int i=0;i<n;i++) {
			System.out.println(i+" "+distance[i]);
		}
		
	}


	private static int findMinVertex(boolean[] visited, int[] distance) {
		// TODO Auto-generated method stub
		int minVertex=-1;
		for(int i=0;i<visited.length;i++) {
			if(!visited[i] && (minVertex==-1 ||  distance[i] < distance[minVertex]) ) {
				minVertex=i;
			}
		}
		return minVertex;
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	        DijkStraAlgoritham(adjMat);
	        sc.close();
// main  ctr+space(2)
	        //syso ctr+space(2) println
	       
	}

	
	
	
}
