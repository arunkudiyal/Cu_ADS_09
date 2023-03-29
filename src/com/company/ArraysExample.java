package com.company;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax :- datatype[] arrName = new int[size];
        // datatype[] arrName = {};
        // datatype[] arrName = new int[]{};
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input of the array elts.
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i < n; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();

        // SubArrays
        // 1. Complete array to iterate
        for(int i=0; i < n; i++) {
            // 2. i -> i-1 impossible
            for(int j = i; j < n; j++) {
                // 3. start -> i, end -> j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "  ");         //
                }
                System.out.println();
            }
        }
    }
}
