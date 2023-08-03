package com.ll.silver.silver5.p11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, N - 1, K - 1);
        System.out.println(arr[K - 1]);
    }

    private static void quickSort(int[] arr, int start, int end, int k) {
        if (start < end) {
            int pivot = select(arr, start, end);

            if (pivot == k) return;
            else if (pivot > k)
                quickSort(arr, start, pivot -1, k);
            else
                quickSort(arr, pivot + 1, end, k);
        }
    }

    private static int select(int[] arr, int start, int end) {
        if (start + 1 == end) {
            if (arr[start] > arr[end]) swap(arr, start, end);
            return end;
        }
        int middle = (start + end) / 2;
        swap(arr, start, middle);
        int pivot = arr[start];

        int i = start + 1;
        int j = end;

        while (i <= j) {
            while (arr[j] > pivot && j > 0) j--;
            while (arr[i] < pivot && i < arr.length - 1) i++;

            if (i <= j) {
                swap(arr, i++, j--);
            }
        }

        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}