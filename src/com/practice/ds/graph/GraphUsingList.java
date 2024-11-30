package com.practice.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class  GraphUsingList{
    int numberOfVertices = 4;
    List<List<Integer>> graph = new ArrayList<>();
    GraphUsingList(int numberOfVertices){
        this.numberOfVertices=numberOfVertices;
        for(int i=0;i<numberOfVertices;i++){
            graph.add(new ArrayList<>(numberOfVertices));
        }
    }

    public void addEdge(int source,int destination){
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    public void printGraph() {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + ":");
            for (int j :graph.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        GraphUsingList graphUsingList = new GraphUsingList(4);
        graphUsingList.addEdge(0,1);
        graphUsingList.addEdge(0,2);
        graphUsingList.addEdge(0,3);
        graphUsingList.addEdge(3,2);
        graphUsingList.printGraph();
    }
}
