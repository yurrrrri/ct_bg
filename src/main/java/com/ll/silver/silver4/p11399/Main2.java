package com.ll.silver.silver4.p11399;

import java.util.Scanner;

// 삽입 정렬
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] S = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=1; i<N; i++) {
            int point = i;
            int value = A[i];
            for(int j=i-1; j>=0; j--) {
                if(A[j] < A[i]) {
                    point = j+1;
                    break;
                }
                if(j == 0) {
                    point = 0;
                }
            }

            for(int j=i; j>point; j--) {
                A[j] = A[j-1];
            }
            A[point] = value;
        }

        S[0] = A[0];
        for(int i=1; i<N; i++) {
            S[i] = S[i-1] + A[i];
        }
        int sum = 0;
        for(int i : S) {
            sum += i;
        }

        System.out.println(sum);
    }
}
