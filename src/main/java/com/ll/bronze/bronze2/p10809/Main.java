package com.ll.bronze.bronze2.p10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }

        String word = br.readLine();
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 97;
            if(arr[index] == -1) arr[index] = i;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }

        br.close();
    }
}
