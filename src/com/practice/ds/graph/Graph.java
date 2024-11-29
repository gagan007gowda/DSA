package com.practice.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    Map<T, List<T>> graph = new HashMap<>();

    public void addVertex(T data) {
        graph.put(data, new ArrayList<T>());
    }

    public void addEdges(T source, T destination) {
        if (!graph.containsKey(source)) {
            System.out.println("Vertex " + source + " not found.");
            return;
        }
        if (!graph.containsKey(destination)) {
            System.out.println("Vertex " + destination + "not found.");
            return;
        }
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    public void printGraph() {
        for (T key : graph.keySet()) {
            System.out.print(key + ":-> {");
            for (T linkedNode : graph.get(key)) {
                System.out.print(linkedNode + " ");
            }
            System.out.print("}\n");
        }
    }
}
