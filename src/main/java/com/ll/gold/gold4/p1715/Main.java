package com.ll.gold.gold4.p1715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int cards1, cards2;
        int result = 0;

        while (pq.size() != 1) {
            cards1 = pq.remove();
            cards2 = pq.remove();
            result += cards1 + cards2;
            pq.add(cards1 + cards2);
        }

        System.out.println(result);
    }
}
