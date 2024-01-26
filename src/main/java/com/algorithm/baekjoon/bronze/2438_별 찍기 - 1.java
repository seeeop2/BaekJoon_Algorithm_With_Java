package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int input = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < input ; i++){
            for (int j = 0 ; j <= i ; j++){
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
