package com.ll.silver.silver1.p2343;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (start < arr[i]) start = arr[i];
            end += arr[i];
        }

        while (start <= end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > middle) {
                    count++;
                    sum = 0;
                }
                sum += arr[i];
            }

            if (sum != 0) count++;

            if (count > M)
                start = middle + 1;
            else end = middle - 1;
        }

        System.out.println(start);
    }
}
