import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger c = new BigInteger(br.readLine());

        BigInteger x = findX(a, b, c);

        bw.write(String.valueOf(x));

        bw.flush();
        bw.close();
    }
    public static BigInteger findX(BigInteger a, BigInteger b, BigInteger c){
        BigInteger x = b.subtract(c).divide(a);
        return x;
    }
}
