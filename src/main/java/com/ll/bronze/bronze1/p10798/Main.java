package com.ll.bronze.bronze1.p10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[5];
        int max = 0;
        for(int i=0; i<5; i++){
            arr[i] = br.readLine();
            if(max < arr[i].length()) max = arr[i].length();
        }

        for(int i=0; i<max; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j].length() - 1 < i) continue;
                sb.append(arr[j].charAt(i));
            }
        }

        System.out.println(sb);

        br.close();
    }
}
