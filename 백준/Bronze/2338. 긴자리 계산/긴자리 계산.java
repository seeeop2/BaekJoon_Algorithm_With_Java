import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        BigInteger firstInputLine = new BigInteger(br.readLine());
        BigInteger secondInputLine = new BigInteger(br.readLine());

        String firstOutputLine = String.valueOf( firstInputLine.add(secondInputLine) );
        String secondOutputLine = String.valueOf( firstInputLine.subtract(secondInputLine) );
        String thirdOutputLine = String.valueOf( firstInputLine.multiply(secondInputLine) );

        bw.write(firstOutputLine);
        bw.newLine();
        bw.write(secondOutputLine);
        bw.newLine();
        bw.write(thirdOutputLine);
        bw.flush();
        bw.close();
    }
}
