import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int minProblems = Integer.parseInt(inputs[0]);
        int maxProblems = Integer.parseInt(inputs[1]);

        inputs = br.readLine().split(" ");
        int solvedProblems = Integer.parseInt(inputs[0]);
        int allowedDifference = Integer.parseInt(inputs[1]);

        int lowerBound = solvedProblems - allowedDifference;
        int upperBound = solvedProblems + allowedDifference;

        int validLowerBound = Math.max(lowerBound, minProblems);
        int validUpperBound = Math.min(upperBound, maxProblems);

        int friendCount = Math.max(0, validUpperBound - validLowerBound + 1);

        String result = friendCount == 0 ? "IMPOSSIBLE" : Integer.toString(friendCount);
        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
