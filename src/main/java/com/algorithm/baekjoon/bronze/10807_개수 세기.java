package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int firstInput =  Integer.parseInt( br.readLine());
        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int needToFind = Integer.parseInt( br.readLine());
        int result = 0;

        for (Integer integer : list) {
            if(integer == needToFind){
                result++;
            }
        }
        
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
