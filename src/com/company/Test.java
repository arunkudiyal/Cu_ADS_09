package com.company;

import java.util.Scanner;

class Test {
    public static int maximumSumSubArray(int n, int arr[], int k) {
        if(n < k) {
            System.out.println("Invalid!");
            return -1;
        }
        int res = 0;
        // Sum of the first window
        for(int i=0; i < k; i++)
            res += arr[i];
        int max_sum = res;
        for(int i=k; i < n; i++) {
            max_sum += arr[i] - arr[i-k];
            res = Math.max(res, max_sum);
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int result = maximumSumSubArray(n, arr, k);
        System.out.println(result);
    }
}
