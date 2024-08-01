import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] strArr = br.readLine().split(" ");

        BigInteger a = new BigInteger(strArr[0]);
        BigInteger b = new BigInteger(strArr[1]);


        String result1 = String.valueOf(a.divide(b));
        String result2 = String.valueOf(a.remainder(b));

        bw.write(result1);
        bw.newLine();
        bw.write(result2);
        bw.flush();
        bw.close();
    }
}
