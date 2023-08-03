package com.ll.platinum.platinum5.p1517;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr, temp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N + 1];
        temp = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        result = 0;
        mergeSort(1, N);
        System.out.println(result);
    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) return;

        int middle = (start + end) / 2;
        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        for (int i = start; i <= end; i++)
            temp[i] = arr[i];

        int t = start;
        int i = start;
        int j = middle + 1;

        while (i <= middle && j <= end) {
            if (temp[i] > temp[j]) {
                arr[t] = temp[j];
                result += j - t;
                t++; j++;
            } else arr[t++] = temp[i++];
        }

        while (i <= middle) arr[t++] = temp[i++];
        while (j <= end) arr[t++] = temp[j++];
    }
}