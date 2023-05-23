package com.ll.bronze.bronze2.p28062;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int minOdd = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            if(num % 2 == 1 && minOdd > num) minOdd = num;
        }

        if(sum % 2 == 0) System.out.println(sum);
        else {
            sum -= minOdd;
            System.out.println(sum);
        }

        br.close();
    }
}
