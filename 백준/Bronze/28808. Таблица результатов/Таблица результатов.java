import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int solvedProblemsCount = 0;

        for (int i = 0; i < n; i++) {
            String results = br.readLine();
            if (results.contains("+")) {
                solvedProblemsCount++;
            }
        }

        bw.write(Integer.toString(solvedProblemsCount));
        bw.flush();
        bw.close();
        br.close();
    }
}
