package com.algorithm.baekjoon.bronze;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        BigInteger total = new BigInteger(br.readLine());
        BigInteger gap = new BigInteger(br.readLine());
        
        /*
        * total = A + B <--첫번째 입력
        * gap   = A - B <--두번째 입력
        *
        * A = total - B
        * 대입하면,
        *  gap = (total - B) - B
        * 2B = total - gap
        * B = (total - gap) / 2
        *
        * B값을 알 수 있기에, (A = total - B) 여기에 대입을 해도 되고,
        * 위 방식을 다시 계산해도 된다.
        * 즉,
        * B = total - A
        * 대입하면,
        * gap = A - (total - A)
        * 2A = gap + total
        * A = (gap + total) / 2
        *
        * 따라서,
        * A = (gap + total) / 2
        * B = (total - gap) / 2
        * */

        BigInteger firstPerson = total.add(gap).divide(BigInteger.valueOf(2));
        BigInteger secondPerson = total.subtract(gap).divide(BigInteger.valueOf(2));


        bw.write(String.valueOf(firstPerson));
        bw.newLine();
        bw.write(String.valueOf(secondPerson));

        bw.flush();
        bw.close();
    }
}
