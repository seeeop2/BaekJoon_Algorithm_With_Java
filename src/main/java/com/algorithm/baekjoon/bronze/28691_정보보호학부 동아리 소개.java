package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String,String> clubList = new HashMap<>();
        clubList.put("M","MatKor");
        clubList.put("W","WiCys");
        clubList.put("C","CyKor");
        clubList.put("A","AlKor");
        clubList.put("$","$clear");

        String minjae = br.readLine();
        String jooyoung = clubList.get(minjae);

        bw.write(jooyoung);

        bw.flush();
        bw.close();
    }
}
