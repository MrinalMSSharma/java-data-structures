package org.com.ds.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListGraph {

    private LinkedList<Integer> list[];
    private int vertices;
    private int edges;

    public ListGraph(int vertices){

        this.vertices = vertices;
        this.edges = 0;
        this.list = new LinkedList[vertices];

        for(int i=0; i<this.vertices; i++){
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){

        list[u].add(v);
        list[v].add(u);
        edges++;
    }

    public void bfs(int source){

        Boolean[] visited = new Boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.offer(source);
        while(!queue.isEmpty()){
            Integer value = queue.poll();
            System.out.println(value);
            for(int v: list[value]){
                if(!visited[v]){
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }

    public void dfs(int source){

        Boolean[] visited = new Boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while(!stack.isEmpty()){
            Integer pop = stack.pop();
            if(!visited[pop]){
                visited[pop] = true;
                System.out.println(pop);
                for(int v: list[pop]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}