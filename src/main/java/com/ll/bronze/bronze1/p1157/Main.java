package com.ll.bronze.bronze1.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int[] count = new int[26];
        char[] arr = word.toCharArray();
        for(char c : arr){
            int index = c - 65;
            count[index]++;
        }

        int bigger = 0;
        char c = '?';
        for(int i=0; i<26; i++){
            if(bigger < count[i]) {
                bigger = count[i];
                c = (char) (i + 65);
            } else if(count[i] == bigger) c = '?';
        }

        System.out.println(c);

        br.close();
    }
}
