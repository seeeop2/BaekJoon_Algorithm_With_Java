package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        int addition = 0;

        for (int i = 0 ; i < loop ; i++){
            int input = Integer.parseInt(br.readLine());
            addition += input;
        }

        bw.write(String.valueOf(addition));

        bw.flush();
        bw.close();
    }
}
