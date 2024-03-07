package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int numberOfInput = Integer.parseInt(br.readLine());
        String prefix = "Case #";

        for (int i = 1 ; i <= numberOfInput ; i++){
            List<Integer> input = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
            int firstInt = input.get(0);
            int secondInt = input.get(1);

            int addition = firstInt + secondInt;

            bw.write(prefix + i + ": " + firstInt + " + " + secondInt +" = " + addition);
            if (i == numberOfInput){
                break;
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
