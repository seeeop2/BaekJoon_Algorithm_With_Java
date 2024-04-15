package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());

        int priceOfCompetitor = inputList.get(0);
        int performanceOfCompetitor = inputList.get(1);
        int priceOfWarboy = inputList.get(2);

        int performancePerPriceOfCompetitor = performanceOfCompetitor / priceOfCompetitor;
        int performancePerPriceOfWarboy = performancePerPriceOfCompetitor * 3;
        int performanceOfWarboy = performancePerPriceOfWarboy * priceOfWarboy;

        bw.write(String.valueOf(performanceOfWarboy));

        bw.flush();
        bw.close();
    }
}
