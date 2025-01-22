import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int lastDigit;

            if (n >= 5) {
                lastDigit = 0;
            } else {
                int factorialN = 1;
                for (int j = 1; j <= n; j++) {
                    factorialN *= j;
                }
                lastDigit = factorialN % 10;
            }
            bw.write(lastDigit + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}