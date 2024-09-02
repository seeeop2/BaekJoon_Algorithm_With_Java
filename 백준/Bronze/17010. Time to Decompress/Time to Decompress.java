import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfTestCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            String[] input = br.readLine().split(" ");
            int repeatCount = Integer.parseInt(input[0]);
            String stringToRepeat = input[1];

            for (int j = 0; j < repeatCount; j++) {
                bw.write(stringToRepeat);
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
