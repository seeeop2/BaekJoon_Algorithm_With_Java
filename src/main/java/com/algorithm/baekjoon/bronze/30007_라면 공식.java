package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
      
        for (int i = 0 ; i < n ; i++){
            List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
            int a = inputList.get(0);
            int b = inputList.get(1);
            int x = inputList.get(2);
            int w = a * (x - 1) + b;

            bw.write(String.valueOf(w));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
