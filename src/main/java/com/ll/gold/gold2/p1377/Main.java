package com.ll.gold.gold2.p1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Data[] arr = new Data[N];
        for(int i=0; i<N; i++) {
            arr[i] = new Data(i, Integer.parseInt(br.readLine()));
        }
        Arrays.sort(arr);

        int max = 0;
        for(int i=0; i<N; i++) {
            if(max < arr[i].idx - i) {
                max = arr[i].idx - i;
            }
        }
        System.out.println(max + 1);
    }

    static class Data implements Comparable<Data> {

        int idx;
        int value;

        public Data(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }

        @Override
        public int compareTo(Data o) {
            return this.value - o.value;
        }
    }
}
