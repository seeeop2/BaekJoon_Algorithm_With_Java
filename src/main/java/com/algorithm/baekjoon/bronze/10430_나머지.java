package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int[] intArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int firstOutput  = (intArr[0] + intArr[1]) % intArr[2];
        int secondOutput = ((intArr[0] % intArr[2]) + (intArr[1] % intArr[2])) % intArr[2];
        int thirdOutput  = (intArr[0] * intArr[1]) % intArr[2];
        int fourthOutput = ((intArr[0] % intArr[2]) * (intArr[1] % intArr[2])) % intArr[2];

        bw.write(firstOutput  + "\n");
        bw.write(secondOutput + "\n");
        bw.write(thirdOutput  + "\n");
        bw.write(fourthOutput + "");

        bw.flush();
        bw.close();
    }
}
