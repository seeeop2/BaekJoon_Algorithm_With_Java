package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Long result = 1L;

        while(n > 0){
            result *= n;
            n--;
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
