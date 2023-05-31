package com.ll.gold.gold3.p10986;

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

        int[] sumArr = new int[n + 1];
        long[] remainder = new long[m];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            sumArr[i] = (sumArr[i - 1] + Integer.parseInt(st.nextToken())) % m;
            remainder[sumArr[i]]++;
        }

        long result = remainder[0];
        for(int i=0; i<m; i++) {
            if(remainder[i] > 1)
                result += (remainder[i] * (remainder[i] - 1) / 2);
        }

        System.out.println(result);
        br.close();
    }
}
