package com.ll.silver.silver5.p2018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1; int end = 1;
        int sum = 1; int result = 1;

        while(start <= n/2) {
            if(sum == n) {
                result++; end++; sum += end;
            } else if(sum < n) {
                end++; sum += end;
            } else {
                sum -= start;
                start++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
