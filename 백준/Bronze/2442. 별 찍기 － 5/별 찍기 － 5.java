import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n^2)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}