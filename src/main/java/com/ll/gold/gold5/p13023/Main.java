package com.ll.gold.gold5.p13023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static boolean arrived;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++)
            arr[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr[start].add(end);
            arr[end].add(start);
        }

        for (int i = 0; i < N; i++) {
            dfs(i, 1);

            if (arrived) break;
        }

        if (arrived) System.out.println("1");
        else System.out.println("0");

        br.close();
    }

    private static void dfs(int now, int depth) {
        if (depth == 5 || arrived) {
            arrived = true;
            return;
        }

        visited[now] = true;

        for (int i : arr[now]) {
            if (!visited[i]) dfs(i, depth + 1);
        }

        visited[now] = false;
    }
}