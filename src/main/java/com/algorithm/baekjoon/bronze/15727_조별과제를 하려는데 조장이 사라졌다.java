package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int maxSpeed = 5;
        int distance = Integer.parseInt(br.readLine());
        int remainder = distance % maxSpeed;

        if (remainder == 0){
            int minutes = distance / maxSpeed;
            String minutesToString = String.valueOf(minutes);

            bw.write(minutesToString);
        } else{
            int minutes = distance / maxSpeed + 1;
            String minutesToString = String.valueOf(minutes);

            bw.write(minutesToString);
        }

        bw.flush();
        bw.close();
    }
}
