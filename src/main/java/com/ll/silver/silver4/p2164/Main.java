package com.ll.silver.silver4.p2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result;

        if(n == 1) result = 1;
        else if(n <= 3) result = 2;
        else {
            Queue<Integer> queue = new LinkedList<>();
            for(int i=1; i<=n; i++) queue.add(i);

            while(queue.size() > 1){
                queue.remove();
                int temp = queue.poll();
                queue.offer(temp);
            }
            result = queue.peek();
        }
        System.out.println(result);

        br.close();
    }
}
