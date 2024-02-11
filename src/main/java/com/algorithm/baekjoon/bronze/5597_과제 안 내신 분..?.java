package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int[] apply = new int[28];

        for(int i = 0 ; i < 28 ; i++){
            int input = Integer.parseInt(br.readLine());
            apply[i] = input;
        }

        for (int i = 1 ; i <= 30 ; i++ ){
            String check = "";

            for (int j = 0 ; j < apply.length ; j++){
                if (apply[j] == i){
                    check = "존재";
                    break;
                }
            }

            if(check != "존재") {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
