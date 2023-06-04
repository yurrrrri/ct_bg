package com.ll.silver.silver2.p1874;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        boolean flag = true;
        int now = 1;
        for(int i=0; i<n; i++) {
            int target = Integer.parseInt(br.readLine());

            if(now <= target) {
                while(now <= target) {
                    stack.push(now++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if(stack.peek() > target) {
                    System.out.println("NO");
                    flag = false;
                    return;
                } else {
                    stack.pop();
                    sb.append("-\n");
                }
            }
        }

        if(flag) System.out.println(sb);

        br.close();
    }
}
