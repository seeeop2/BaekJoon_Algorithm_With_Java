import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int firstNumber = Integer.parseInt(input[0]);
        int secondNumber = Integer.parseInt(input[2]);
        int resultNumber = Integer.parseInt(input[4]);

        String result = (firstNumber + secondNumber == resultNumber) ? "YES" : "NO";

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
