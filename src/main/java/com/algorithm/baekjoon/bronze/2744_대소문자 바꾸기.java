package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        char[] chars = br.readLine().toCharArray();

        for (char ch : chars) {
            if( Character.isUpperCase(ch) ){
                ch = Character.toLowerCase(ch);
            } else if( Character.isLowerCase(ch) ){
                ch = Character.toUpperCase(ch);
            }
            bw.write(ch);
        }

        bw.flush();
        bw.close();
    }
}
