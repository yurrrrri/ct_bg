package com.ll.bronze.bronze2.p2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String[] rs = br.readLine().split(" ");
            int r = Integer.parseInt(rs[0]);
            String s = rs[1];

            for(int j=0; j<s.length(); j++){
                System.out.print(s.substring(j, j+1).repeat(r));
            }
            System.out.println();
        }

        br.close();
    }
}
