package com.algorithm.baekjoon.bronze;

package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
            String dog = "|\\_/|\n" +
                        "|q p|   /}\n" +
                        "( 0 )\"\"\"\\\n" +
                        "|\"^\"`    |\n" +
                        "||_/=\\\\__|";

            bw.write(dog);
    
            bw.flush();
            bw.close();
    }
}
