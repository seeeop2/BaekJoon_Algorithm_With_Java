package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String heart=
                " @@@   @@@ \n" +
                "@   @ @   @\n" +
                "@    @    @\n" +
                "@         @\n" +
                " @       @ \n" +
                "  @     @  \n" +
                "   @   @   \n" +
                "    @ @    \n" +
                "     @     ";

        int loop = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < loop ; i++){
            bw.write(heart);
            if (i != loop -1){
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
