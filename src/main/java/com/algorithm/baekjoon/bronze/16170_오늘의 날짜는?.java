package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        ZoneId zoneIdOfUtc = ZoneId.of("UTC");
        ZonedDateTime UtcTime = ZonedDateTime.now(zoneIdOfUtc);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedTimeOfUtc = UtcTime.format(formatter);
        List<String> list = Arrays.stream(formattedTimeOfUtc.split("-")).collect(Collectors.toList());
        for (String it : list) {
            bw.write(it);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
