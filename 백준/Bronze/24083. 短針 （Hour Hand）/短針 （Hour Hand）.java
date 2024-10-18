import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstNumber = Integer.parseInt(br.readLine());
        int secondNumber = Integer.parseInt(br.readLine());

        int sum = firstNumber + secondNumber;
        int result = (sum % 12 != 0) ? (sum % 12) : 12;

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}
