package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int firstInput = Integer.parseInt(br.readLine());
        int result = 1;

        for (int i = firstInput ; i > 0 ; i--){
            result = i * result;
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
