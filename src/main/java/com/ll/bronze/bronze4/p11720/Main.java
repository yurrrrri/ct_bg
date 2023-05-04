package com.ll.bronze.bronze4.p11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String numbers = sc.next();

        int result = 0;
        char[] cArr = numbers.toCharArray();
        for(char c : cArr) {
            result += c - '0';
        }

        System.out.println(result);

        sc.close();
    }
}
