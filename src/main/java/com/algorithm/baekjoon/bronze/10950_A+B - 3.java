package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int numberOfTests = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < numberOfTests ; i++ ){
            List<Integer> test = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
            String resultOfTest = String.valueOf(test.get(0) + test.get(1));
            bw.write(resultOfTest);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
