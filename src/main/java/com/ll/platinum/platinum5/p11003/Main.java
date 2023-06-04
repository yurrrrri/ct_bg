package com.ll.platinum.platinum5.p11003;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Node> deque = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }
            deque.addLast(new Node(i, now));

            if(deque.getFirst().idx <= i - L) {
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value + " ");
        }

        bw.flush();

        br.close();
        bw.close();
    }

    static class Node {
        int idx;
        int value;

        public Node(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }
}
/*
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + L - 1];
        for(int i=0; i<L - 1; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        st = new StringTokenizer(br.readLine());
        for(int i = L-1; i < N + L - 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = arr[L - 1];
        bw.write(answer + " ");

        for(int i = L; i < N + L - 1; i++) {
            if(arr[i - L] == answer) {
                answer = Integer.MAX_VALUE;
                for(int j=i - L + 1; j<=i; j++) {
                    if(answer > arr[j]) answer = arr[j];
                }
            }
            if(arr[i] < answer) answer = arr[i];

            bw.write(answer + " ");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
*/