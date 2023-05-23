package com.ll.bronze.bronze4.p28074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> set = new HashSet<>();
        set.add('M');
        set.add('O');
        set.add('B');
        set.add('I');
        set.add('S');

        char[] bits = br.readLine().toCharArray();
        for(char c : bits){
            if(set.contains(c)) set.remove(c);
        }
        System.out.println(set.size() == 0 ? "YES" : "NO");

        br.close();
    }
}
