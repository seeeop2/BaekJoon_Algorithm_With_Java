package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> s = Arrays.stream(br.readLine().split("")).collect(Collectors.toList());
        int i = Integer.parseInt(br.readLine());
        String output = s.get(i-1);

        bw.write(output);

        bw.flush();
        bw.close();
    }
}
