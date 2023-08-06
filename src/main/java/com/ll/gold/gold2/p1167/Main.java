package com.ll.gold.gold2.p1167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[] visited;
    static int[] distance;
    static ArrayList<Edge>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());

        arr = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            arr[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < V; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());

            while (true) {
                int end = Integer.parseInt(st.nextToken());

                if (end == -1) break;

                int d = Integer.parseInt(st.nextToken());
                arr[start].add(new Edge(end, d));
            }
        }

        distance = new int[V + 1];
        visited = new boolean[V + 1];
        bfs(1);
        int maxIndex = 1;
        for (int i = 2; i <= V; i++) {
            if (distance[maxIndex] < distance[i])
                maxIndex = i;
        }

        distance = new int[V + 1];
        visited = new boolean[V + 1];
        bfs(maxIndex);
        Arrays.sort(distance);
        System.out.println(distance[V]);

        br.close();
    }

    private static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Edge e : arr[now]) {
                int node = e.n;
                int d = e.d;

                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    distance[node] = distance[now] + d;
                }
            }
        }
    }

    private static class Edge {
        int n;
        int d;

        public Edge(int node, int distance) {
            this.n = node;
            this.d = distance;
        }
    }
}
