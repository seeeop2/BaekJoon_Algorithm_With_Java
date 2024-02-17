package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int questions = Integer.parseInt(br.readLine());
        int totalQuestions = questions + 1;

        int minimum = totalQuestions * 2;
        int maximum = totalQuestions * 3;

        bw.write(minimum + " " + maximum);
        bw.flush();
        bw.close();
    }
}
