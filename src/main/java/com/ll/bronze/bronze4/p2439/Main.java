package com.ll.bronze.bronze4.p2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i));
        }

        sc.close();
    }
}
