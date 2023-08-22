package graph;

import java.util.ArrayList;

// Undirected, weighted graph
public class weighted_graph {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) { // Pass graph array // Initially there is null value in arraylist
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>(); // Created an empty ArrayList at every index
        }
        // Add edges at all the index
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static void main(String[] args) {

        int V = 4; // Number of vertices is 4
        ArrayList<Edge>[] graph = new ArrayList[V]; // Define the graph
        createGraph(graph);

        // Print 2's neighbors
        for (int i = 0; i < graph[2].size(); i++) { // Size of ArrayList
            Edge e = graph[2].get(i);
            System.out.println("Destination: " + e.dest + ", Weight: " + e.wt);
        }
    }
}
