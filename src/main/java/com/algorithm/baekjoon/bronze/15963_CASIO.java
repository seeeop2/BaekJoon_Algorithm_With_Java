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

        List<BigInteger> list = Arrays.stream(br.readLine().split(" ")).map(it -> new BigInteger(it)).collect(Collectors.toList());
        BigInteger songchan = list.get(0);
        BigInteger teacher = list.get(1);

        if (songchan.equals(teacher)){
            bw.write("1");
        } else{
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
