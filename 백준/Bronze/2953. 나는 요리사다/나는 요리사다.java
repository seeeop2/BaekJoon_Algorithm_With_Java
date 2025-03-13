import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int winningParticipant = 0;
        int highestScore = 0;

        for (int participant = 1; participant <= 5; participant++) {
            String[] scores = br.readLine().split(" ");
            int totalScore = 0;

            for (String score : scores) {
                totalScore += Integer.parseInt(score);
            }

            if (totalScore > highestScore) {
                winningParticipant = participant;
                highestScore = totalScore;
            }
        }

        bw.write(winningParticipant + " " + highestScore);
        bw.flush();
        bw.close();
        br.close();
    }
}
