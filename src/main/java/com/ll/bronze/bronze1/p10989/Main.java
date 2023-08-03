package com.ll.bronze.bronze1.p10989;

import java.io.*;

public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
//        Arrays.sort(arr);
//
//        for(int i : arr) sb.append(i).append("\n");
//
//        System.out.println(sb);
//
//        br.close();
//    }

    // 기수 정렬
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        radixSort(arr, 5);

        for (int num : arr) bw.write(num + "\n");

        bw.flush(); bw.close(); br.close();
    }

    private static void radixSort(int[] arr, int max) {
        int[] result = new int[arr.length];

        int target = 1;
        int count = 0;

        while (count != max) {
            int[] bucket = new int[10];
            for (int n : arr)
                bucket[(n / target) % 10]++;

            for (int i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];

            for (int i = arr.length - 1; i >= 0; i--) {
                result[bucket[(arr[i] / target % 10)] -1] = arr[i];
                bucket[(arr[i] / target) % 10]--;
            }

            for (int i = 0; i < arr.length; i++)
                arr[i] = result[i];

            target *= 10;
            count++;
        }
    }
}
