package com.ll.silver.silver4.p9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

//        for(int i=0; i<t; i++){
//            String ps = br.readLine();
//            if(ps.startsWith(")") || ps.endsWith("(")) sb.append("NO\n");
//            else {
//                char[] bits = ps.toCharArray();
//                Stack<Character> stack = new Stack<>();
//                for(char c : bits){
//                    if(c == '(') stack.push('(');
//                    else if(c == ')' && stack.isEmpty()) {
//                        stack.push(')');
//                        break;
//                    } else stack.pop();
//                }
//                if(stack.size() != 0) sb.append("NO\n");
//                else sb.append("YES\n");
//            }
//        }

        for(int i=0; i<t; i++){
            String ps = br.readLine();
            if(ps.startsWith(")") || ps.endsWith("(")) sb.append("NO\n");
            else {
                char[] bits = ps.toCharArray();
                int a = 0;
                boolean flag = true;
                for(char c : bits){
                    if(c == '(') a++;
                    else a--;
                    if(a < 0) flag = false;
                }
                if(a == 0 && flag) sb.append("YES\n");
                else sb.append("NO\n");
            }
        }

        System.out.println(sb);

        br.close();
    }
}
