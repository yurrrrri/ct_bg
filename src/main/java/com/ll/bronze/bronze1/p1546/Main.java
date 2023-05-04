package com.ll.bronze.bronze1.p1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        double max = 0;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(max < num) max = num;
            scores[i] = num;
        }

        double sum = 0;
        for(int score : scores) {
            sum += score / max * 100;
        }

        System.out.println(sum / n);
        sc.close();
    }
}
