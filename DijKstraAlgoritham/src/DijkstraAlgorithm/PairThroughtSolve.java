package DijkstraAlgorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair<T1, T2> {
    private final T1 first;
    private final T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}

public class PairThroughtSolve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        List<List<Pair<Integer, Integer>>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            int w = s.nextInt();
            graph.get(u).add(new Pair<>(v, w));
            graph.get(v).add(new Pair<>(u, w));
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getSecond() - b.getSecond());
        pq.add(new Pair<>(0, 0));

        boolean[] visited = new boolean[V];

        while (!pq.isEmpty()) {
            int u = pq.poll().getFirst();

            if (visited[u]) {
                continue;
            }
            visited[u] = true;

            for (Pair<Integer, Integer> p : graph.get(u)) {
                int v = p.getFirst();
                int w = p.getSecond();

                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair<>(v, dist[v]));
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }
}
