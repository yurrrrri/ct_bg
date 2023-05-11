package com.ll.bronze.bronze5.p2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] matrix = new int[n][m];

        for(String s : nm) {
            for (int i = 0; i < n; i++) {
                String[] bits = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] += Integer.parseInt(bits[j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
