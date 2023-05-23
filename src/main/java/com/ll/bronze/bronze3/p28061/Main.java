package com.ll.bronze.bronze3.p28061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken()) - (n - i);
            if(num > max) max = num;
        }

        System.out.println(max);
        br.close();
    }
}
