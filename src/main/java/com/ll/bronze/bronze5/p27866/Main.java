package com.ll.bronze.bronze5.p27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int n = Integer.parseInt(br.readLine());

        System.out.println(word.charAt(n - 1));

        br.close();
    }
}
