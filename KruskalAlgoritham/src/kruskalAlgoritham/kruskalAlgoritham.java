package kruskalAlgoritham;

import java.util.Arrays;

import java.util.Scanner;

 class UnionFind {
    private int[] parent;
    private int[] size;

    public UnionFind(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (size[rootX] < size[rootY]) {
                int temp = rootX;
                rootX = rootY;
                rootY = temp;
            }
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }
    }
}


class Edge implements Comparable<Edge>{
    int v1;
    int v2;
    int weight;
    Edge(int v1,int v2,int weight){
        this.v1=v1;
        this.v2=v2;
        this.weight=weight;
    }
    public int compareTo(Edge o) {
        return this.weight-o.weight;
    }
}
public class kruskalAlgoritham {
    private static Edge[] KruskalAlgorithm(Edge [] edges,int n) {
        Arrays.sort(edges);
        Edge mst[]=new Edge[n-1];
        int parent[]=new int[n];
        for(int j=0;j<n;j++) {
            parent[j]=j;
        }
        int count=0;
        int i = 0; // added initialization for i
        while(count!=n-1) {
            Edge currentEdge=edges[i++];
            int v1Parent=findParent(currentEdge.v1,parent);
            int v2Parent=findParent(currentEdge.v2,parent);
            if(v1Parent!=v2Parent) {
                // Including current edge
                mst[count]=currentEdge;
                count++;
                parent[v1Parent]=v2Parent;
            }
        }
        return mst;
    }

    private static int findParent(int v,int parent[]) {
        if(v==parent[v])
            return v;

        return findParent(parent[v], parent);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        Edge edges[]=new Edge[e];
        for(int i=0;i<e;i++) {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int weight=sc.nextInt();
            Edge edge=new Edge(v1, v2, weight);
            edges[i]=edge;
        }

        Edge mst[]=KruskalAlgorithm(edges,n);

        for(int i=0;i<mst.length;i++) {
            // Fixed bug in print statement: should be concatenating v2 and v1 instead of adding them
            if(mst[i].v1<mst[i].v2) {
                System.out.print(mst[i].v1+" "+mst[i].v2+" "+mst[i].weight);
            } else {
                System.out.print(mst[i].v2 + " " + mst[i].v1 + " " + mst[i].weight);
            }
            // Added a newline character to separate each edge in the output
            System.out.println();//  time complexcity is =ELog(E)+EV(find cycle dection);  E=>n^2; path compression is solution time complecity reduce
        }
    }
}
