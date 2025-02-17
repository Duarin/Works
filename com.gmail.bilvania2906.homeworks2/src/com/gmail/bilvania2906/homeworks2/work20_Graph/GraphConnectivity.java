package com.gmail.bilvania2906.homeworks2.work20_Graph;

import java.util.List;
import java.util.Map;

public class GraphConnectivity {
    public static boolean isGraphConnected(int vertices, Map<Integer, List<Integer>> adjacencyList) {
        boolean[] visited = new boolean[vertices + 1];
        dfs(1, adjacencyList, visited);
        for (int i = 1; i <= vertices; i++) {
            if (!visited[i]) {
                return false;

            }

        }
        return true;
    }

    private static void dfs(int node, Map<Integer, List<Integer>> adjacencyList, boolean[] visited) {
        visited[node] = true;
        if (adjacencyList.containsKey(node)) {
            for (int neighbor : adjacencyList.get(node)) {
                if (!visited[neighbor]) {
                    dfs(neighbor, adjacencyList, visited);
                }
            }
        }

    }
}
