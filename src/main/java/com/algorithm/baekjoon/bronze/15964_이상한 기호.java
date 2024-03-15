package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Long> list = Arrays.stream(br.readLine().split(" ")).map((it -> Long.parseLong(it))).collect(Collectors.toList());
        long a = list.get(0);
        long b = list.get(1);
        Long result = myCalculator(a, b);

        bw.write(result.toString());

        bw.flush();
        bw.close();
    }
    public static long myCalculator(long a, long b){
        long result = (a + b) * (a - b);
        return result;
    }
}
