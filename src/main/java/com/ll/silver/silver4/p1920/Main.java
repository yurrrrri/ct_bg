package com.ll.silver.silver4.p1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");

        for(String s : arr1) set.add(s);

        int m = Integer.parseInt(br.readLine());
        String[] arr2 = br.readLine().split(" ");

        for(String s : arr2){
            if(set.contains(s)) System.out.println(1);
            else System.out.println("0");
        }

        br.close();
    }
}
