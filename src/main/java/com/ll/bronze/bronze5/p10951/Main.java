package com.ll.bronze.bronze5.p10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null) {
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            System.out.println(a + b);
        }

        br.close();
    }
}
