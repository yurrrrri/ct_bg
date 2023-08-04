package com.ll.gold.gold5.p2023;

import java.util.Scanner;

public class Main {

    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

        sc.close();
    }

    private static void dfs(int num, int target) {
        if (target == N) {
            if (isPrime(num))
                System.out.println(num);
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) continue;
            if (isPrime(num * 10 + i)) {
                dfs(num * 10 + i, target + 1);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                return false;
        return true;
    }
}