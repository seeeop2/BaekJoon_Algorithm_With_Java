package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hours;
        int days = Integer.parseInt(br.readLine());
      
        if(days < 1 || days > 365){
            throw new RuntimeException("1 <= x <= 365");
        }

        hours = 24 * days;

        bw.write(String.valueOf(hours));

        bw.flush();
        bw.close();
    }
}
