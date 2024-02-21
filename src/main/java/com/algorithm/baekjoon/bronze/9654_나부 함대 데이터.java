package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String output = "SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n" +
                        "N2 Bomber      Heavy Fighter  Limited    21        \n" +
                        "J-Type 327     Light Combat   Unlimited  1         \n" +
                        "NX Cruiser     Medium Fighter Limited    18        \n" +
                        "N1 Starfighter Medium Fighter Unlimited  25        \n" +
                        "Royal Cruiser  Light Combat   Limited    4         ";

        bw.write(output);

        bw.flush();
        bw.close();
    }
}
