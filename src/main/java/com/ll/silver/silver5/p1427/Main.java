package com.ll.silver.silver5.p1427;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = sc.next().toCharArray();
        int[] arr = new int[cArr.length];
        for(int i=0; i<cArr.length; i++) {
            arr[i] = cArr[i] - '0';
        }

        Arrays.sort(arr);

        for(int i=arr.length - 1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
