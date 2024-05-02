package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String,String> schoolList = new HashMap<>();
        schoolList.put("NLCS","North London Collegiate School");
        schoolList.put("BHA","Branksome Hall Asia");
        schoolList.put("KIS","Korea International School");
        schoolList.put("SJA","St. Johnsbury Academy");

        String shortNameOfSchool = br.readLine();
        String longNameOfSchool = schoolList.get(shortNameOfSchool);

        bw.write(longNameOfSchool);

        bw.flush();
        bw.close();
    }
}
