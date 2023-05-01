package com.company;

import java.util.Scanner;

public class CanSumProblem {
    public static boolean canSum(int n, int[] arr, int targetSum) {
        if(targetSum == 0) return true;
        if(targetSum < 0) return false;
        for(int i=0; i < n; i++) {
            int remainder = targetSum - arr[i];
            return canSum(n, arr, remainder);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        int targetSum = sc.nextInt();
        boolean possible = canSum(n, arr, targetSum);
        System.out.println(possible);
    }
}
