package com.ll.bronze.bronze2.p1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine().trim();

        String[] arr = sentence.split(" ");

        int result = arr.length;
        if(sentence.equals("")) result = 0;

        System.out.println(result);

        br.close();
    }
}
