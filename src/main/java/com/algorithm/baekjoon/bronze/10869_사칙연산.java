package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        int addition       = list.get(0) + list.get(1);
        int subtraction    = list.get(0) - list.get(1);
        int multiplication = list.get(0) * list.get(1);
        int division       = list.get(0) / list.get(1);
        int remainder      = list.get(0) % list.get(1);

        bw.write(addition + "\n");
        bw.write(subtraction + "\n");
        bw.write(multiplication + "\n");
        bw.write(division + "\n");
        bw.write(remainder + "");

        bw.flush();
        bw.close();
    }
}
