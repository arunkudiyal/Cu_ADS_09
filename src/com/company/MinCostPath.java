package com.company;

import java.util.Scanner;

public class MinCostPath {
    public static int minCostPath(int m, int n, int[][] cost, int[][] memo) {
        if(m == 0 && n == 0) return cost[m][n];
        if(m < 0 || n < 0) return Integer.MAX_VALUE;
        if(memo[m][n] != -1) return memo[m][n];
        memo[m][n] = Integer.min(minCostPath(m, n-1, cost, memo), minCostPath(m-1, n, cost, memo)) + cost[m][n];
        return memo[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] cost = new int[m][n];
        for(int i=0; i < m; i++) {
            for(int j=0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        int[][] memo = new int[m][n];
        for(int i=0; i < m; i++) {
            for(int j=0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        int ans = minCostPath(m-1, n-1, cost, memo);
        System.out.println(ans);
    }
}
