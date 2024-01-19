package com.algorithm.backjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);

        String result = String.valueOf(a + b);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
