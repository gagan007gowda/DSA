package com.practice.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUsingListUndirected {
    int numberOfVertices = 4;
    List<List<Integer>> undirectedGraph = new ArrayList<>();
    GraphUsingListUndirected(int numberOfVertices){
        this.numberOfVertices=numberOfVertices;
        for(int i=0;i<numberOfVertices;i++){
            undirectedGraph.add(new ArrayList<>(numberOfVertices));
        }
    }

    public void addEdge(int source,int destination){
        undirectedGraph.get(source).add(destination);
        undirectedGraph.get(destination).add(source);
    }

    public void printGraph() {
        for (int i = 0; i < undirectedGraph.size(); i++) {
            System.out.print(i + ":");
            for (int j : undirectedGraph.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        GraphUsingListUndirected graphUsingListUndirected = new GraphUsingListUndirected(4);
        graphUsingListUndirected.addEdge(0,1);
        graphUsingListUndirected.addEdge(0,2);
        graphUsingListUndirected.addEdge(0,3);
        graphUsingListUndirected.addEdge(3,2);
        graphUsingListUndirected.printGraph();
    }
}
