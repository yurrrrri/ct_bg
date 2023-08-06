package com.ll.silver.silver5.p1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;
        for (int i = 0; i < N; i++) {
            char[] arr = sc.next().toCharArray();
            int[] index = new int[26];

            for (int j = 0; j < 26; j++) {
                index[j] = -1;
            }

            boolean isGroupWord = true;
            for (int k = 0; k < arr.length; k++) {
                if (index[arr[k] - 97] != -1 && k - index[arr[k] - 97] != 1) {
                    isGroupWord = false;
                    break;
                } else {
                    index[arr[k] - 97] = k;
                }
            }

            if (isGroupWord) result++;
        }

        System.out.println(result);
    }
}
