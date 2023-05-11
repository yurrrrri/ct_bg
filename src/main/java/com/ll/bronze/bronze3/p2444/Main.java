package com.ll.bronze.bronze3.p2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        for(int i=n-1; i>0; i--){
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }

        sc.close();
    }
}
