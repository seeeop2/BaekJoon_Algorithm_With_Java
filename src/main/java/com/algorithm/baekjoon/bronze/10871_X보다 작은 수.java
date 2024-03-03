package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> firstInputLine = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        List<Integer> secondInputLine = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        int defaultNumber = firstInputLine.get(1);

        for (Integer integer : secondInputLine) {
            if (integer < defaultNumber){
                bw.write(integer + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
