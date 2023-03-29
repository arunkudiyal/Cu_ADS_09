package com.company;

import java.util.Scanner;

public class SlidingWindow_1 {
    public static int maxSumSubArray(int n, int[] arr, int k) {
        if(n < k) {
            System.out.println("INVALID!");
            return -1;
        }
        int sum = 0;
        for(int i=0; i < k; i++)
            sum += arr[i];
        int possible_ans = sum;
        for(int i=k; i < n; i++) {
            possible_ans += arr[i] - arr[i-k];
            sum = Integer.max(possible_ans, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int max_sum = maxSumSubArray(n, arr, k);
        System.out.println(max_sum);
    }
}
