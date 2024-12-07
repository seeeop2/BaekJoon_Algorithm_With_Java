import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCaseCount; i++) {
            int rank = Integer.parseInt(br.readLine());
            String round;

            if (rank <= 25) {
                round = "World Finals";
            } else if (rank <= 1000) {
                round = "Round 3";
            } else if (rank <= 4500) {
                round = "Round 2";
            } else {
                round = "Round 1";
            }

            bw.write("Case #" + i + ": " + round + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
