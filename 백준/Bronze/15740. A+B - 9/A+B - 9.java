import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<BigInteger> list = Arrays.stream(br.readLine().split(" ")).map(it -> new BigInteger(it)).collect(Collectors.toList());

        BigInteger first = list.get(0);
        BigInteger second = list.get(1);

        BigInteger addition = first.add(second);

        bw.write(addition.toString());

        bw.flush();
        bw.close();
    }
}
