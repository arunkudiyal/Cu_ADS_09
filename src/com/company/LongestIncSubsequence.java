package com.company;

import java.util.Scanner;

public class LongestIncSubsequence {
    public static int lis(int n, int[] arr) {
        int[] memo = new int[n];
        // memo[0] = 1;
        for(int i=0; i < n; i++)
            memo[i] = 1;
        int max = 0;
        for(int i=1; i <n; i++) {
            for(int j=i-1; j >= 0; j--) {
                if(arr[i] <= arr[j])
                    continue;
                int pA = memo[j] + 1;
                if(pA > memo[i])
                    memo[i] = pA;
            }
        }
        for(int i=0; i < n; i++) {
            if(memo[i] > max)
                max = memo[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        int ans = lis(n, arr);
        System.out.println(ans);
    }
}
