package com.practice.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUsingListDirected {
    List<List<Integer>> directedGraph;
    List<List<Integer>> transposeGraph;
    GraphUsingListDirected(int numberOfVertices){
        directedGraph = new ArrayList<>(numberOfVertices);
        transposeGraph = new ArrayList<>(numberOfVertices);
        for(int i=0;i<numberOfVertices;i++){
            directedGraph.add(new ArrayList<>(numberOfVertices));
            transposeGraph.add(new ArrayList<>(numberOfVertices));
        }
    }

    public void addEdge(int source,int destination){
        directedGraph.get(source).add(destination);
    }

    public void printGraph() {
        for (int i = 0; i < directedGraph.size(); i++) {
            System.out.print(i + ":");
            for (int j : directedGraph.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void printTransposeGraph() {
        for (int i = 0; i < transposeGraph.size(); i++) {
            System.out.print(i + ":");
            for (int j : transposeGraph.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void transposeEdge(int source, int destination) {
        transposeGraph.get(destination).add(source);
    }

    public void getTranspose(){
        for(int i=0;i<directedGraph.size();i++){
            for(int j:directedGraph.get(i)){
                transposeEdge(i,j);
            }
        }
    }

    public static void main(String[] args){
        GraphUsingListDirected directedGraph = new GraphUsingListDirected(4);
        directedGraph.addEdge(0,1);
        directedGraph.addEdge(0,2);
        directedGraph.addEdge(0,3);
        directedGraph.addEdge(3,2);
        //directedGraph.printGraph();
        directedGraph.getTranspose();
        directedGraph.printTransposeGraph();
    }
}
