package com.ll.bronze.bronze2.p2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");

        StringBuffer _a = new StringBuffer(ab[0]).reverse();
        StringBuffer _b = new StringBuffer(ab[1]).reverse();

        int a = Integer.parseInt(String.valueOf(_a));
        int b = Integer.parseInt(String.valueOf(_b));

        if(a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        br.close();
    }
}
