package com.practice.ds.graph;

public class GraphMain {

    public static void main(String[] args){
        Graph<String> graph = new Graph<>();
        graph.addVertex("Alex");
        graph.addVertex("Bod");
        graph.addVertex("Cathy");
        graph.addVertex("Donald");

        graph.addEdges("Alex","Bob");
        graph.printGraph();
    }
}
