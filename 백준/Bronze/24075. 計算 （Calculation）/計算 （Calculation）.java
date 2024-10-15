import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int firstNumber = Integer.parseInt(input[0]);
        int secondNumber = Integer.parseInt(input[1]);

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;

        int max = Math.max(sum, subtraction);
        int min = Math.min(sum, subtraction);

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(min));

        bw.flush();
        br.close();
        bw.close();
    }
}
