package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] inputStrArr = br.readLine().split(" ");
        int firstInput  = Integer.parseInt(inputStrArr[0]);
        int secondInput = Integer.parseInt(inputStrArr[1]);
        int[][] intArr= new int[firstInput][secondInput];
        int cnt = 2;

        for(int i = 0 ; i < cnt ; i++) {
            for (int j = 0 ; j < firstInput ; j++) {
                String[] forStrArr = br.readLine().split(" ");

                for (int k = 0 ; k < secondInput ; k++) {
                    int forFirst = Integer.parseInt(forStrArr[k]);
                    intArr[j][k] += forFirst;
                }
            }
        }

        for (int i = 0 ; i < firstInput ; i++){
            for(int j = 0 ; j < secondInput ; j++){
                bw.write( String.valueOf(intArr[i][j]) );
                bw.write(" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
