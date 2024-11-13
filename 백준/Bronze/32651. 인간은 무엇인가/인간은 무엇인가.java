import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int TARGET_YEAR = 2024;

        int inputNumber = Integer.parseInt(br.readLine());

        String result = (inputNumber % TARGET_YEAR == 0 && inputNumber <= 100000) ? "Yes" : "No";

        bw.write(result);
        
        bw.flush();
        bw.close();
        br.close();
    }
}
