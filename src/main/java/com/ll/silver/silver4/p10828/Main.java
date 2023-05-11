package com.ll.silver.silver4.p10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] stack;
    private static int size = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        stack = new int[n];
        for(int i=0; i<n; i++){
            String command = br.readLine();
            if(command.equals("pop")) pop();
            else if(command.equals("size")) size();
            else if(command.equals("empty")) empty();
            else if(command.equals("top")) top();
            else {
                String[] bits = command.split(" ");
                push(bits[1]);
            }
        }
        System.out.println(sb);

        br.close();
    }

    private static void pop() {
        if(size == 0) sb.append("-1").append("\n");
        else {
            sb.append(stack[size - 1]).append("\n");
            stack[size - 1] = 0;
            size--;
        }
    }

    private static void size() {
        sb.append(size).append("\n");
    }

    private static void empty() {
        if(size == 0) sb.append("1").append("\n");
        else sb.append("0").append("\n");
    }

    private static void top() {
        if(size == 0) sb.append("-1").append("\n");
        else sb.append(stack[size - 1]).append("\n");
    }

    private static void push(String bit) {
        int num = Integer.parseInt(bit);
        stack[size++] = num;
    }
}
