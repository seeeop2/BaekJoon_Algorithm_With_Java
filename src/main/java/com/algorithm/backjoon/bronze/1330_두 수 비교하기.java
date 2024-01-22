package com.algorithm.backjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);

        if(a > b){
            bw.write(">");
        } else if(a < b){
            bw.write("<");
        } else{
            bw.write("==");
        }
        bw.flush();
        bw.close();
    }
}
