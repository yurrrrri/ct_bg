package com.ll.silver.silver2.p1541;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("-");

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result += sum(arr[i]);
            } else {
                result -= sum(arr[i]);
            }
        }

        System.out.println(result);
    }

    private static int sum(String s) {
        int sum = 0;
        String[] arr = s.split("[+]");
        for (String num : arr) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
