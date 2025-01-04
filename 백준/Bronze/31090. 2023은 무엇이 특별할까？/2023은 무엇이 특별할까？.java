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
        for (int i = 0; i < testCaseCount; i++) {
            int currentYear = Integer.parseInt(br.readLine());
            int nextYear = currentYear + 1;
            int lastTwoDigits = currentYear % 100;
            String result = nextYear % lastTwoDigits == 0 ? "Good" : "Bye";

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
