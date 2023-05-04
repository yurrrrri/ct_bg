package com.ll.silver.silver3.p11659;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int line = sc.nextInt();

        int[] sumArr = new int[n + 1];
        for(int i=1; i<=n; i++) {
            sumArr[i] = sumArr[i-1] + sc.nextInt();
        }

        for(int i=0; i<line; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(sumArr[end] - sumArr[start - 1]);
        }

        sc.close();
    }
}
