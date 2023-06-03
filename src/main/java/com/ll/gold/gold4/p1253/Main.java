package com.ll.gold.gold4.p1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n <= 2) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;

        for(int i=0; i<n; i++) {
            int start = 0; int end = n - 1;

            while(true) {
                if(start == i) start++;
                else if(end == i) end--;

                if(start >= end) break;

                if(arr[start] + arr[end] == arr[i]) {
                    result++;
                    break;
                } else if(arr[start] + arr[end] < arr[i]) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(result);
        br.close();
    }
}
