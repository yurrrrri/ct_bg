package com.ll.bronze.bronze3.p2525;

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
        int time = Integer.parseInt(br.readLine());

        int result = hour * 60 + minuit + time;
        if(result >= (24 * 60)) result -= 24 * 60;
        hour = result / 60;
        minuit = result % 60;

        System.out.println(hour + " " + minuit);

        br.close();
    }
}
