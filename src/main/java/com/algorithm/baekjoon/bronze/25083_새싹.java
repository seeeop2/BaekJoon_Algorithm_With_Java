package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String sprout =
                        "         ,r'\"7\n" +
                        "r`-_   ,'  ,/\n"   +
                        " \\. \". L_r'\n"   +
                        "   `~\\/\n"        +
                        "      |\n"         +
                        "      |";

        bw.write(sprout);
        bw.flush();
        bw.close();
    }
}
