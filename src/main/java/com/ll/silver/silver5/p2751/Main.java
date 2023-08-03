package com.ll.silver.silver5.p2751;

import java.io.*;

public class Main {
    // p2750과 같음
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//        List<Integer> list = new ArrayList<>();
//        for(int i=0; i<n; i++){
//            list.add(Integer.parseInt(br.readLine()));
//        }
//        Collections.sort(list);
//
//        for(int i=0; i<list.size(); i++){
//            bw.write(list.get(i) + "\n");
//        }
//
//        bw.flush();
//
//        br.close();
//        bw.close();
//    }

    public static int[] arr, temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        temp = new int[N + 1];

        for (int i = 1; i <= N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        mergeSort(1, N);

        for (int k = 1; k <= N; k++)
            bw.write(arr[k] + "\n");

        bw.flush();
        bw.close();
    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) return;

        int middle = start + (end - start) / 2;
        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        for (int i = start; i <= end; i++) temp[i] = arr[i];

        int t = start;
        int i = start;
        int j = middle + 1;

        while (i <= middle && j <= end) {
            if (temp[i] > temp[j]) arr[t++] = temp[j++];
            else arr[t++] = temp[i++];
        }

        while (i <= middle) arr[t++] = temp[i++];
        while (j <= end) arr[t++] = temp[j++];
    }

}