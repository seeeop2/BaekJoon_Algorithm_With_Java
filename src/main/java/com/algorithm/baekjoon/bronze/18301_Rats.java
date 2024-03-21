package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int n1 = inputList.get(0);
        int n2 = inputList.get(1);
        int n12 = inputList.get(2);

        int N = nFunction(n1, n2, n12);
        
        bw.write(String.valueOf(N));

        bw.flush();
        bw.close();
    }

    public static int nFunction(int n1, int n2, int n3){

        int result = (n1 + 1) * (n2 + 1) / (n3 + 1) - 1;

        return result;
    }
}
