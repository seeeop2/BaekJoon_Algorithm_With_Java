package com.algorithm.baekjoon.bronze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        String star = "";

        if (620 <= input){
            star = "Red";
        }
        else if(590 <= input){
            star = "Orange";
        }
        else if(570 <= input){
            star = "Yellow";
        }
        else if(495 <= input){
            star = "Green";
        }
        else if(450 <= input){
            star = "Blue";
        }
        else if(425 <= input){
            star = "Indigo";
        }
        else if(380 <= input){
            star = "Violet";
        }

        bw.write(star);

        bw.flush();
        bw.close();
    }
}
