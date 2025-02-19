import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] results = br.readLine().split(" ");

        int totalScore = 0;
        int currentStreak = 0;

        for (String result : results) {
            if (result.equals("1")) {
                currentStreak++;
                totalScore += currentStreak;
            } else {
                currentStreak = 0;
            }
        }

        bw.write(Integer.toString(totalScore));
        bw.flush();
        bw.close();
        br.close();
    }
}
