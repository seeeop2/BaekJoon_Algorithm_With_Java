package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int gap = 543;
        int buddhistCalendar = Integer.parseInt(br.readLine());
        int annoDomini = buddhistCalendar - gap;

        bw.write(String.valueOf(annoDomini));

        bw.flush();
        bw.close();
    }
}
