package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int timeToSleep = Integer.parseInt(br.readLine());
        int timeToWakeUp = Integer.parseInt(br.readLine());
        int sleep = 0;

        while(timeToWakeUp != timeToSleep){

            if(timeToWakeUp == 0){
                timeToWakeUp = 24;
            }

            sleep++;
            timeToWakeUp--;
        }

        bw.write(String.valueOf(sleep));

        bw.flush();
        bw.close();
    }
}
