package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] strArr = br.readLine().split(" ");

        int firstOfArray  = (int) Math.pow(Integer.parseInt(strArr[0]),2);
        int secondOfArray = (int) Math.pow(Integer.parseInt(strArr[1]),2);
        int thirdOfArray  = (int) Math.pow(Integer.parseInt(strArr[2]),2);
        int fourthOfArray = (int) Math.pow(Integer.parseInt(strArr[3]),2);
        int fifthOfArray  = (int) Math.pow(Integer.parseInt(strArr[4]),2);

        String result = String.valueOf( (firstOfArray + secondOfArray + thirdOfArray + fourthOfArray + fifthOfArray) % 10);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
