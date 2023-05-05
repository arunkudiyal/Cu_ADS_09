package com.company;

import java.util.Scanner;

public class IntroductionToGraphs {
    /*  9
        0 4 0 0 0 0 0 8 0
        4 0 8 0 0 0 0 11 0
        0 8 0 7 0 4 0 0 2
        0 0 7 0 9 14 0 0 0
        0 0 0 9 10 0 0 0 0
        0 0 4 14 10 0 0 0 0
        0 0 0 0 0 2 0 1 6
        8 11 0 0 0 0 1 0 7
        0 0 2 0 0 0 6 7 0
    */

    public static int minKey(int V, int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int v = 0; v < V; v++)
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    public static void printMST(int V, int[] parent, int[][] graph) {
        System.out.println("Edge \t Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }

    public static void primMST(int V, int[][] graph) {
        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int count = 0; count < V - 1; count++) {
            int u = minKey(V, key, mstSet);
            mstSet[u] = true;
            for (int v = 0; v < V; v++)
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }
        printMST(V, parent, graph);
    }

    public static void display(int v, int[][] graph) {
        for(int i=0; i < v; i++) {
            for(int j=0; j < v; j++) {
                if(graph[i][j] != -1) {
                    System.out.println(i + " --> " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int[][] graph = new int[V][V];
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        // display(V, graph);
        primMST(V, graph);
    }
}
