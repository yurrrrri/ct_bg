package com.ll.bronze.bronze5.p11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int code = str.charAt(0);
        System.out.println(code);

        br.close();
    }
}
