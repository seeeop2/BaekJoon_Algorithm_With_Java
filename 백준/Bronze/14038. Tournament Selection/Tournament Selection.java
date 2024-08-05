import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalGames = 6;
        int winCount = 0;
        String result;

        for (int i = 0; i < totalGames; i++) {
            String gameResult = br.readLine();

            if (gameResult.equals("W")) {
                winCount++;
            }
        }

        if (winCount >= 5) {
            result = "1";
        } else if (winCount >= 3) {
            result = "2";
        } else if (winCount >= 1) {
            result = "3";
        } else {
            result = "-1";
        }

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
