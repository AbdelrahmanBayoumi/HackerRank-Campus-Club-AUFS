package Representation;

import java.util.*;
import javafx.util.Pair;

public class WeightedGraph {

    private static LinkedList<Pair<Integer, Integer>>[] ConstructGraph(int V) {
        LinkedList<Pair<Integer, Integer>> adjListArray[] = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            // every index in the adjListArray contains an LinkedList 
            // for the adjacent vertices 
            adjListArray[i] = new LinkedList<>();
        }
        return adjListArray;
    }

    private static void addEdge(LinkedList<Pair<Integer, Integer>>[] adjListArray, int src, int dest, int weight) {
        // Add an edge from src to dest
        adjListArray[src].add(new Pair<>(dest, weight)); // src --> dest
        // Since graph is undirected, add an edge from dest to src also 
        adjListArray[dest].add(new Pair<>(src, weight)); // dest --> src 
    }

    private static void printGraph(LinkedList<Pair<Integer, Integer>>[] graph) {
        for (int vertex = 0; vertex < graph.length; vertex++) {
            System.out.println("Node " + vertex + " makes an edge with ");
            for (Pair<Integer, Integer> pair : graph[vertex]) {
                System.out.println("\tNode" + pair.getKey() + " with edge weight= " + pair.getValue());
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // number of vertices
        LinkedList<Pair<Integer, Integer>>[] graph = ConstructGraph(V);
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 4, 20);
        addEdge(graph, 1, 2, 30);
        addEdge(graph, 1, 3, 40);
        addEdge(graph, 1, 4, 50);
        addEdge(graph, 2, 3, 60);
        addEdge(graph, 3, 4, 70);
        // print the adjacency list representation of the above graph
        printGraph(graph);
    }
}
