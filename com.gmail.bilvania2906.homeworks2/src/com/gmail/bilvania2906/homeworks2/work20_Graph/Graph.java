package com.gmail.bilvania2906.homeworks2.work20_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private final Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }

    public void addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void removeVertex(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            for (int neighbor : adjacencyList.get(vertex)) {
                adjacencyList.get(neighbor).remove(vertex);
            }
            adjacencyList.remove(vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (adjacencyList.containsKey(source) && adjacencyList.containsKey(destination)) {
            adjacencyList.get(source).remove(destination);
            adjacencyList.get(destination).remove(source);
        }
    }

    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
    }

    public void printGraph() {
        for (Map.Entry<Integer, Set<Integer>> entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
