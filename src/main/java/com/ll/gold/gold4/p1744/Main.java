package com.ll.gold.gold4.p1744;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int zero = 0;
        int one = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num == 0) zero++;
            else if (num == 1) one++;
            else if (num > 1) plusPq.add(num);
            else minusPq.add(num);
        }

        int result = 0;
        while (plusPq.size() > 1) {
            int n1 = plusPq.remove();
            int n2 = plusPq.remove();
            result += n1 * n2;
        }
        if (!plusPq.isEmpty()) {
            result += plusPq.remove();
        }

        while (minusPq.size() > 1) {
            int n1 = minusPq.remove();
            int n2 = minusPq.remove();
            result += n1 * n2;
        }
        if (!minusPq.isEmpty()) {
            if (zero == 0) {
                result += minusPq.remove();
            }
        }

        result += one;

        System.out.println(result);
    }
}
