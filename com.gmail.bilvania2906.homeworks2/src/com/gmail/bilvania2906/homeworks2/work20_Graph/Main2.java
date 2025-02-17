package com.gmail.bilvania2906.homeworks2.work20_Graph;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість вершин: ");
        int vertices = scanner.nextInt();

        System.out.print("Введіть кількість ребер: ");
        int edges = scanner.nextInt();

        Map<Integer, List<Integer>> adjacencyList= new HashMap<>();

        System.out.println("Введіть ребра (from to):");
        for (int i=0;i<edges;i++){
            int from = scanner.nextInt();
            int to = scanner.nextInt();

            adjacencyList.putIfAbsent(from,new ArrayList<>());
            adjacencyList.putIfAbsent(to,new ArrayList<>());

            adjacencyList.get(from).add(to);
            adjacencyList.get(to).add(from);
        }

        boolean isConnect = GraphConnectivity.isGraphConnected(vertices, adjacencyList);
        if (isConnect) {
            System.out.println("Граф зв'язний");
        } else {
            System.out.println("Граф не зв'язний");
        }

        scanner.close();
    }
}
