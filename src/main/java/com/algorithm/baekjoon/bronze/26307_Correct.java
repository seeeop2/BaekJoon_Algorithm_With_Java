package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int startedHH = 9;
        int startedMM = 0;

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        int finishedHH = inputList.get(0);
        int finishedMM = inputList.get(1);

        int timeForSolvingTest = (finishedHH - startedHH) * 60 + (finishedMM - startedMM);

        bw.write(String.valueOf(timeForSolvingTest));

        bw.flush();
        bw.close();
    }
}
