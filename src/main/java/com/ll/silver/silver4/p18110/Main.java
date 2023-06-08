package com.ll.silver.silver4.p18110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int exclude = (int) Math.round(n * 0.15);
        double result = 0;

        for(int i=exclude; i < n - exclude; i++) result += arr[i];

        result  = result / (n - exclude * 2);
        System.out.println(Math.round(result));
    }
}
