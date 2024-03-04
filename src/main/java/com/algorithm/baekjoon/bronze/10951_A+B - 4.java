package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String input;

        while ((input = br.readLine()) != null){
            List<Integer> list = Arrays.stream(input.split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
            int addition = list.get(0) + list.get(1);
            String additionToString = String.valueOf(addition);
            
            bw.write(additionToString);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
