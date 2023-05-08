package com.ll.bronze.bronze2.p10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] balls = new int[n];
        for(int i=0; i<n; i++){
            balls[i] = i + 1;
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            while(a < b){
                int temp = balls[a];
                balls[a++] = balls[b];
                balls[b--] = temp;
            }
        }

        for(int ball : balls){
            System.out.print(ball + " ");
        }

        br.close();
    }
}
