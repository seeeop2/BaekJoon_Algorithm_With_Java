package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int numberOfCases = 1;

        while(true){
            String input = br.readLine();
            if (input.equals("0")){
                break;
            }
            bw.write("Case " + numberOfCases +": Sorting... done!\n");
            numberOfCases++;
        }

        bw.flush();
        bw.close();
    }
}
