package com.ll.silver.silver1.p1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Times> list = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            long start = Long.parseLong(st.nextToken());
            long end = Long.parseLong(st.nextToken());
            list.add(new Times(start, end));
        }

        Collections.sort(list);

        int result = 0;
        long ends = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStart() >= ends) {
                ends = list.get(i).getEnd();
                result++;
            }
        }

        System.out.println(result);
    }

    private static class Times implements Comparable<Times> {
        long start;
        long end;

        public long getStart() {
            return start;
        }

        public long getEnd() {
            return end;
        }

        public Times(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Times t) {
            if (this.end == t.end) {
                return this.start - t.start > 0 ? 1 : -1;
            }
            return this.end - t.end > 0 ? 1 : -1;
        }
    }
}
