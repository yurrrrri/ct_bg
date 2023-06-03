package com.ll.silver.silver4.p1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;
        int start = 0; int end = n-1;
        while(start < end) {
            if(arr[start] + arr[end] > m) {
                end--;
            } else if(arr[start] + arr[end] < m) {
                start++;
            } else {
                result++; start++; end--;
            }
        }

        System.out.println(result);
        br.close();
    }
}
