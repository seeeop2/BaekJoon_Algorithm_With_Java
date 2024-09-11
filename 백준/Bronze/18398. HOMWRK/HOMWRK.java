import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            int pairCount = Integer.parseInt(br.readLine());

            for (int j = 0; j < pairCount; j++) {
                String[] inputNumbers = br.readLine().split(" ");
                int firstNumber = Integer.parseInt(inputNumbers[0]);
                int secondNumber = Integer.parseInt(inputNumbers[1]);

                int sum = firstNumber + secondNumber;
                int product = firstNumber * secondNumber;

                bw.write(sum + " " + product + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
