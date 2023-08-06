package com.ll.gold.gold2.p1300;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        long result = 0;
        long start = 1, end = k;
        while (start <= end) {
            long middle = (start + end) / 2;
            long count = 0;

            for (int i = 1; i <= N; i++) {
                count += Math.min(middle / i, N);
            }

            if (count < k)
                start = middle + 1;
            else {
                result = middle;
                end = middle - 1;
            }
        }

        System.out.println(result);
    }
}
