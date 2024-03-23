package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String message = "SciComLove";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < N ; i++){
            bw.write(message);
            if (i != N-1){
                bw.newLine();
            }
        }
        
        bw.flush();
        bw.close();
    }
}
