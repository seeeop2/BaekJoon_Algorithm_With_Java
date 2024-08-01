import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger input;
        int luckyNumber = 42;

        while(!(input = new BigInteger(br.readLine())).equals(BigInteger.valueOf(0))){
            if (input.mod(BigInteger.valueOf(luckyNumber)).equals(BigInteger.valueOf(0))){
                bw.write("PREMIADO");
            }
            else{
                bw.write("TENTE NOVAMENTE");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
