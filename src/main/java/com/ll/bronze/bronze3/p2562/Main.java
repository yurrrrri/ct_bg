package com.ll.bronze.bronze3.p2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        int max = Integer.MIN_VALUE;
        for(int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if(max < num) max = num;
        }

        int index = 1;
        for(int num : arr) {
            if(max == num) {
                System.out.println(max);
                System.out.println(index);
            }
            index++;
        }

        br.close();
    }
}
