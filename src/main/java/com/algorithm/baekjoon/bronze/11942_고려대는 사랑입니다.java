package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String output = "고려대학교";

        bw.write(output);

        bw.flush();
        bw.close();
    }
}
