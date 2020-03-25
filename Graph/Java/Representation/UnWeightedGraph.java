package Representation;

import java.util.*;

public class UnWeightedGraph {

    private static LinkedList<Integer>[] ConstructGraph(int V) {
        LinkedList<Integer> adjListArray[] = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            // every index in the adjListArray contains an LinkedList 
            // for the adjacent vertices 
            adjListArray[i] = new LinkedList<>();
        }
        return adjListArray;
    }

    private static void addEdge(LinkedList<Integer>[] adjListArray, int src, int dest) {
        // Add an edge from src to dest
        adjListArray[src].add(dest); // src --> dest
        // Since graph is undirected, add an edge from dest to src also 
        adjListArray[dest].add(src); // dest --> src 
    }

    private static void printGraph(LinkedList<Integer>[] graph) {
        for (int vertex = 0; vertex < graph.length; vertex++) {
            System.out.println("Adjacency list of vertex " + vertex);
            System.out.print("Head");
            for (Integer adjVertex : graph[vertex]) {
                System.out.print(" -> " + adjVertex);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // number of vertices
        LinkedList<Integer>[] graph = ConstructGraph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        // print the adjacency list representation of the above graph
        printGraph(graph);
    }
}
