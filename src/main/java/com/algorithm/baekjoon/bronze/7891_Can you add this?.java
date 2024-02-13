package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int firstInput = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < firstInput ; i++){
            int[] intArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int addition = intArr[0] + intArr[1];
            bw.write(String.valueOf(addition));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
