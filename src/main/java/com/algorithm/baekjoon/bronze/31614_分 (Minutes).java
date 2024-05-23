package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int totalMinutes = h * 60 + m;

        bw.write(String.valueOf(totalMinutes));

        bw.flush();
        bw.close();

    }
}
