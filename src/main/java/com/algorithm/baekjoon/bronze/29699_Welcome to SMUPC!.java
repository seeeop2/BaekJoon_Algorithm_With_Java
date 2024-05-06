package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String label = "WelcomeToSMUPC";

        int n = Integer.parseInt(br.readLine());

        if(n % 14 == 0){
            n = 14;
        } else {
            n %= 14;
        }

        bw.write(label.charAt(n-1));

        bw.flush();
        bw.close();
    }
}
