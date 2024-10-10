import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalSum = 0;
        while (true) {
            String input = br.readLine();
            if (input.equals("-1")) break;

            totalSum += Integer.parseInt(input);
        }

        bw.write(String.valueOf(totalSum));

        bw.flush();
        br.close();
        bw.close();
    }
}
