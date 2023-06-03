package com.ll.silver.silver2.p12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int check;
    static int[] verify;
    static int[] current;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        int result = 0;
        check = 0;

        verify = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<verify.length; i++) {
            verify[i] = Integer.parseInt(st.nextToken());
            if(verify[i] == 0) check++;
        }

        current = new int[4];
        for(int i=0; i<p; i++) {
            add(arr[i]);
        }
        if(check == 4) result++;

        for(int i = p; i < s; i++) {
            int j = i - p;

            add(arr[i]);
            remove(arr[j]);

            if(check == 4) result++;
        }

        System.out.println(result);
        br.close();
    }

    private static void remove(char c) {
        if(c == 'A') {
            if(current[0] == verify[0]) check--;
            current[0]--;
        } else if(c == 'C') {
            if(current[1] == verify[1]) check--;
            current[1]--;
        } else if(c == 'G') {
            if(current[2] == verify[2]) check--;
            current[2]--;
        } else {
            if(current[3] == verify[3]) check--;
            current[3]--;
        }
    }

    private static void add(char c) {
        if(c == 'A') {
            current[0]++;
            if(current[0] == verify[0]) check++;
        } else if(c == 'C') {
            current[1]++;
            if(current[1] == verify[1]) check++;
        } else if(c == 'G') {
            current[2]++;
            if(current[2] == verify[2]) check++;
        } else {
            current[3]++;
            if(current[3] == verify[3]) check++;
        }
    }
}
