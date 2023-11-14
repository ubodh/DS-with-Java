
package GraphFandamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
public static void dftraversal(int adjMat[][],int currentVertex,boolean visited[]) {
	visited[currentVertex]=true;
	System.out.print(currentVertex+" ");
	for(int i=0;i<adjMat.length;i++) {
		if(adjMat[currentVertex][i]==1 && visited[i]==false) {
			dftraversal(adjMat,i,visited);
		}
	}
}
	public static void dftraversal(int adjMat[][]) {
		boolean visited[]=new boolean[adjMat.length];
		for(int i=0;i<adjMat.length;i++) {
		  if(!visited[i]) {
		dftraversal(adjMat,i,visited);
		System.out.println();
		  }
		}
	}
	public static void bfTraversal(int adjMat[][]) {
		Queue<Integer>pendingVertices=new LinkedList<>();
		boolean visited[]=new boolean[adjMat.length];
		visited[0]=true;
		pendingVertices.add(0);
		while(!pendingVertices.isEmpty()) {
			int currentVertex=pendingVertices.poll();
			System.out.print(currentVertex+" ");
			for(int i=0;i<adjMat.length;i++) {
				if(adjMat[currentVertex][i]==1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i]=true;
				}
			}
		}
	}
	
	public static ArrayList<Integer> BSF_Path(int adjMat[][],int s,int e){
		boolean visited[]=new boolean[adjMat.length];
		Queue<Integer>pendingVertices=new LinkedList<>();
		HashMap<Integer,Integer>map=new HashMap<>();
		visited[s]=true;
		
		pendingVertices.add(s);
		map.put(s, -1);
		boolean pathFound=false;
		while(!pendingVertices.isEmpty()) {
			int currentVertes=pendingVertices.poll();
			for(int i=0;i<adjMat.length;i++) {
				if(adjMat[currentVertes][i]==1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i]=true;
					map.put(i, currentVertes);
					if(i==e) {
						pathFound=true;
						break;
					}
				}
			}			
		}
		if(pathFound) {
			ArrayList<Integer>path=new ArrayList<>();
			int currentVertex=e;
			while(currentVertex!=-1) {
			path.add(currentVertex);
			int parent=map.get(currentVertex);
			currentVertex=parent;
		           }
			return path;
		} else {
			return null;
		}
			
	}
	public static ArrayList<Integer> Get_Path_BFS(int adjMat[][], int s, int e) {
	    int n = adjMat.length;
	    boolean[] visited = new boolean[n];
	    ArrayList<Integer> path = new ArrayList<>();
	    Queue<Integer> queue = new LinkedList<>();
	    Map<Integer, Integer> parent = new HashMap<>();

	    visited[s] = true;
	    queue.add(s);// queue.offer(s);
	    while (!queue.isEmpty()) {
	        int current = queue.poll();
	        if (current == e) {
	            while (current != s) {
	                path.add(current);
	                current = parent.get(current);
	            }
	            path.add(s);
	            Collections.reverse(path);
	            return path;
	        }
	        for (int i = 0; i < n; i++) {
	            if (adjMat[current][i] == 1 && !visited[i]) {
	                visited[i] = true;
	                parent.put(i, current);
	                queue.offer(i);
	            }
	        }
	    }
	    return path;
	}
	 public static ArrayList<Integer> Get_Path_DFS(int adjMat[][], int s, int e) {
		    int n = adjMat.length;
		    boolean[] visited = new boolean[n];
		    ArrayList<Integer> path = new ArrayList<>();
		    dfs(adjMat, visited, s, e, path);
		    return path;
		}

private static boolean dfs(int[][] adjMat, boolean[] visited, int current, int end, ArrayList<Integer> path) {
		    if (current == end) {
		        path.add(current);
		        return true;
		    }
		    visited[current] = true;
		    for (int i = 0; i < adjMat[current].length; i++) {
		        if (adjMat[current][i] == 1 && !visited[i]) {
		            if (dfs(adjMat, visited, i, end, path)) {
		                path.add(current);
		                return true;
		            }
		        }
		    }    
		return false;
	}

public static void bfTraversal(int adjMat[][], int v,boolean visited[]){
		    
		    Queue<Integer>pendingVertices = new LinkedList<>();
		    pendingVertices.add(v);
		    visited[v ] = true;
		    while(!pendingVertices.isEmpty()){
		        int n = pendingVertices.poll();
		        System.out.print(n+" ");
		        for(int i = 0 ; i<adjMat.length;i++){
		            if(adjMat[n][i]== 1 && visited[i]== false){
		                pendingVertices.add(i);
		                visited[i]=true;
		            }
		        }
		  }
    }
		
 public static void print(int adjMat[][]){
		   
		    boolean [] visited = new boolean[adjMat.length];
		    
		    for(int i = 0;i<adjMat.length;i++){
		        if(!visited[i]){
		            bfTraversal(adjMat,i,visited);
		        }     
	     }
     }
 
 
 private static void dfs1(int node, ArrayList<ArrayList<Integer>> adjLs ,int vis[]) {
     vis[node] = 1; 
     for(Integer it: adjLs.get(node)) {
         if(vis[it] == 0) {
             dfs1(it, adjLs, vis); 
         }
     }
 }

 
public static void main(String[] args) {
	
	 ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>(); 
     for(int i = 0;i<9;i++) {
         adjLs.add(new ArrayList<Integer>()); 
     }
     
     // to change adjacency matrix to list 
     for(int i = 0;i<9;i++) {
         for(int j = 0;j<9;j++) {
             // self nodes are not considered 
             if(adj.get(i).get(j) == 1 && i != j) {
                 adjLs.get(i).add(j); 
                 adjLs.get(j).add(i); 
             }
         }
     }
	
	
	ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();

    adj.add(new ArrayList<Integer>());
    adj.get(0).add(0, 1);
    adj.get(0).add(1, 0);
    adj.get(0).add(2, 1);
    adj.add(new ArrayList<Integer>());
    adj.get(1).add(0, 0);
    adj.get(1).add(1, 1);
    adj.get(1).add(2, 0);
    adj.add(new ArrayList<Integer>());
    adj.get(2).add(0, 1);
    adj.get(2).add(1, 0);
    adj.get(2).add(2, 1);
            
   
 
	
	
	ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
    for (int i = 0; i < 5; i++) {
        adj.add(new ArrayList < > ());
    }
    adj.get(0).add(2);
    adj.get(2).add(0);
    adj.get(0).add(1);
    adj.get(1).add(0);
    adj.get(0).add(3);
    adj.get(3).add(0);
    adj.get(2).add(4);
    adj.get(4).add(2);
	
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int adjMat[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adjMat[u][v]=1;
			adjMat[v][u]=1;
		}
		int s=sc.nextInt();
		int ee=sc.nextInt();
		
		ArrayList<Integer>ans=BSF_Path(adjMat,s,ee);
		for(int i=ans.size()-1;i>=0;i--) {
			 System.out.print(i+" ");
		}
		
        dftraversal(adjMat);
        System.out.println();
        bfTraversal(adjMat);
   
    }

	}
