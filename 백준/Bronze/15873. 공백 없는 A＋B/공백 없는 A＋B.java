import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] digits = br.readLine().split("");
        int totalSum = 0;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i].equals("0")) {
                String combined = digits[i - 1].concat(digits[i]);
                digits[i - 1] = combined;
            }
        }

        for (String digit : digits) {
            totalSum += Integer.parseInt(digit);
        }

        bw.write(String.valueOf(totalSum));

        bw.flush();
        br.close();
        bw.close();
    }
}
