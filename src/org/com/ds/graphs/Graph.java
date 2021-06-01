package org.com.ds.graphs;

public class Graph {

    private int vertices;
    private int edges;
    private int[][] adjMatrix;

    public Graph(int node){
        this.vertices = node;
        this.edges = 0;
        this.adjMatrix = new int[node][node];
    }

    public void addEdge(int u, int v){

        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        edges++;
    }

    public static void main(String[] args) {

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
    }
}