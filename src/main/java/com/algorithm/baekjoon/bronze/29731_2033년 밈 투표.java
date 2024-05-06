package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> list = new ArrayList<>();
        list.add("Never gonna give you up");
        list.add("Never gonna let you down");
        list.add("Never gonna run around and desert you");
        list.add("Never gonna make you cry");
        list.add("Never gonna say goodbye");
        list.add("Never gonna tell a lie and hurt you");
        list.add("Never gonna stop");

        int n = Integer.parseInt(br.readLine());

        while(n>0){
            String str = br.readLine().trim();
            List<String> collect = list.stream().filter(it -> it.equals(str)).collect(Collectors.toList());
          
            if (collect.isEmpty()){
                bw.write("Yes");

                bw.flush();
                bw.close();
                return;
            }
            n--;
        }

        bw.write("No");

        bw.flush();
        bw.close();
    }
}
