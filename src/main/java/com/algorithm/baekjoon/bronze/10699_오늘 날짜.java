package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        ZoneId zoneIdOfSeoul = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulTime = ZonedDateTime.now(zoneIdOfSeoul);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedTimeOfSeoul = seoulTime.format(formatter);

        bw.write(formattedTimeOfSeoul);

        bw.flush();
        bw.close();
    }
}
