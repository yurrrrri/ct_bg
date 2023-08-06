package com.ll.silver.silver4.p1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");

        Collections.addAll(set, arr1);

        int m = Integer.parseInt(br.readLine());
        String[] arr2 = br.readLine().split(" ");

        for(String s : arr2){
            if(set.contains(s)) System.out.println(1);
            else System.out.println("0");
        }

        br.close();
    }

    // 이진 탐색을 이용한 풀이
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[N];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(arr);
//
//        int M = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < M; i++) {
//            boolean found = false;
//            int target = Integer.parseInt(st.nextToken());
//
//            int start = 0;
//            int end = arr.length - 1;
//
//            while (start <= end) {
//                int midIndex = (start + end) / 2;
//                int midValue = arr[midIndex];
//
//                if (midValue > target)
//                    end = midIndex;
//                else if (midValue < target)
//                    start = midIndex + 1;
//                else {
//                    found = true;
//                    break;
//                }
//            }
//
//            if (found) System.out.println(1);
//            else System.out.println(0);
//        }
//    }
}
