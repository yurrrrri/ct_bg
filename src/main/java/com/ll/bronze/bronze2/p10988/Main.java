package com.ll.bronze.bronze2.p10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String reverse = String.valueOf(new StringBuffer(str).reverse());

        if(str.equals(reverse)) System.out.println("1");
        else System.out.println("0");

        br.close();
    }
}
