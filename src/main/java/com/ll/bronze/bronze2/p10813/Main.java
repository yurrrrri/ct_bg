package com.ll.bronze.bronze2.p10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] balls = new int[n];
        for(int i=0; i<n; i++){
            balls[i] = i + 1;
        }

        for(int i=0; i<m; i++){
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]) - 1;
            int b = Integer.parseInt(nums[1]) - 1;

            int temp = balls[a];
            balls[a] = balls[b];
            balls[b] = temp;
        }

        for(int ball : balls){
            sb.append(ball + " ");
        }

        System.out.println(sb);

        br.close();
    }
}
