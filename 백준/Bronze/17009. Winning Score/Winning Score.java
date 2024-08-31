import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int appleTeamScore = calculateScore(br);
        int bananaTeamScore = calculateScore(br);

        String winningTeam;
        if (appleTeamScore > bananaTeamScore) {
            winningTeam = "A";
        } else if (appleTeamScore < bananaTeamScore) {
            winningTeam = "B";
        } else {
            winningTeam = "T";
        }

        bw.write(winningTeam);
        bw.flush();
        br.close();
        bw.close();
    }

    private static int calculateScore(BufferedReader br) throws IOException {
        int totalScore = 0;
        for (int i = 0; i < 3; i++) {
            int scoreForRound = Integer.parseInt(br.readLine());
            if (i == 0) {
                totalScore += scoreForRound * 3;
            } else if (i == 1) {
                totalScore += scoreForRound * 2;
            } else {
                totalScore += scoreForRound;
            }
        }
        return totalScore;
    }
}
