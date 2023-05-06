package com.ll.bronze.bronze3.p2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minuit = Integer.parseInt(st.nextToken());

        int time = hour * 60 + minuit - 45;
        if(time < 0) time += 60 * 24;
        hour = time / 60;
        minuit = time % 60;

        System.out.printf("%d %d", hour, minuit);

        br.close();
    }
}
