package com.ll.bronze.bronze3.p2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = new int[9][9];
        int num = -1;
        int row = 0; int column = 0;
        for(int i=0; i<9; i++){
            String[] bits = br.readLine().split(" ");
            for(int j=0; j<bits.length; j++){
                int bit = Integer.parseInt(bits[j]);
                matrix[i][j] = bit;
                if(bit > num) {
                    num = bit;
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        System.out.println(num);
        System.out.println(row + " " + column);

        br.close();
    }
}
