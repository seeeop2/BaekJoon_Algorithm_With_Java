package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int apple = Integer.parseInt(br.readLine());
        int mandarin = Integer.parseInt(br.readLine());
        int banana = 3;

        int total = apple + mandarin + banana;

        bw.write(String.valueOf(total));

        bw.flush();
        bw.close();
    }
}
