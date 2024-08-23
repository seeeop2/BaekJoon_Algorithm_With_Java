import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfCases = Integer.parseInt(br.readLine());

        for (int caseIndex = 0; caseIndex < numberOfCases; caseIndex++) {
            int inputNumber = Integer.parseInt(br.readLine());
            long squareResult = (long) inputNumber * inputNumber;

            bw.write(squareResult + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
