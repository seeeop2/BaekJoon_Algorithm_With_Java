package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int h = inputList.get(0);
        int i = inputList.get(1);
        int a = inputList.get(2);
        int r = inputList.get(3);
        int c = inputList.get(4);
        int calculate = (h * i) - (a * r * c);

        bw.write(String.valueOf(calculate));

        bw.flush();
        bw.close();
    }
}
