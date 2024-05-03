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

        int A = inputList.get(1);
        int B = inputList.get(2);

        if(A < B){
            bw.write("Bus");
        }
        else if(A > B){
            bw.write("Subway");
        }
        else{
            bw.write("Anything");
        }

        bw.flush();
        bw.close();
    }
}
