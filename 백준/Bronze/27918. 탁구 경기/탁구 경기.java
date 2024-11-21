import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalGames = Integer.parseInt(br.readLine());
        int scoreD = 0;
        int scoreP = 0;

        for (int i = 0; i < totalGames; i++) {
            String winner = br.readLine();
            if (winner.equals("P")) {
                scoreP++;
            } else {
                scoreD++;
            }

            if (Math.abs(scoreP - scoreD) == 2) {
                break;
            }
        }

        bw.write(scoreD + ":" + scoreP);

        bw.flush();
        bw.close();
        br.close();
    }
}
