package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<BigInteger> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> new BigInteger(it)).collect(Collectors.toList());
        BigInteger firstInput = inputList.get(0);
        BigInteger secondInput = inputList.get(1);
        BigInteger multiplication = firstInput.multiply(secondInput);

        bw.write(multiplication.toString());

        bw.flush();
        bw.close();
    }
}
