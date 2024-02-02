package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] strArr = br.readLine().split("");
        String result = String.valueOf( strArr.length );

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
