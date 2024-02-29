package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<BigInteger> bigIntegerList = Arrays.stream(br.readLine().split(" ")).map(it -> new BigInteger(it)).collect(Collectors.toList());

        BigInteger addition = bigIntegerList.get(0).add(bigIntegerList.get(1));

        String transToString = String.valueOf(addition);

        bw.write(transToString);

        bw.flush();
        bw.close();
    }
}
